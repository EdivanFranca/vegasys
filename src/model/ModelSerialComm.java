/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Edivan
 */

import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import gnu.io.UnsupportedCommOperationException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TooManyListenersException;

public class ModelSerialComm implements SerialPortEventListener {

    private InputStream inputStream; //O InputStream fica fora porque é utilizado depois
    private OutputStream outputStream;
    private String resposta;
    private ArrayList<String> listaPortas = new ArrayList<>();
    private CommPortIdentifier portId;

    private String getPortNameByOS() {

        String osname = System.getProperty("os.name", "").toLowerCase();
        if (osname.startsWith("windows")) {
            return "COM1"; //Se estiver no Windows
        } else if (osname.startsWith("linux")) {
            return "/dev/ttyS0"; //Se estiver no Linux
        } else if (osname.startsWith("mac")) {
            return "???"; //No mac eu não sei
        } else {
            System.out.println("Seu S.O. não é tem suporte ainda!"); //Se não for nenhum deles.
            System.exit(1);
            return null;
        }

    }

    private CommPortIdentifier getPortIdentifier(String portName) {

        //Pega os identificadores de porta
        Enumeration portList = CommPortIdentifier.getPortIdentifiers();
        //Varre as possíveis portas
        while (portList.hasMoreElements()) {
            CommPortIdentifier portId = (CommPortIdentifier) portList.nextElement();

            //Verifica se a porta é a serial
            if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                listaPortas.add(portId.getName());
                System.out.println("Available port: " + portId.getName());
                //Verifica se é o identificador correto (COM1 ou ttsy0)
                if (!portName.isEmpty() && portId.getName().equals(portName)) {
                    System.out.println("Found port: " + portName);
                    return portId;
                }
            }

        }

        return null;

    }

    public void init() {
        //Pega a porta pelo S.O.
       // String portName = getPortNameByOS();

        getPortIdentifier("");

    }

    public boolean connect(String portName, int boundRate) {
        portId = getPortIdentifier(portName);
        try {
            //Abre a porta serial solicitada
            SerialPort serialPort = (SerialPort) portId.open(this.getClass().getName(), 2000);

            //Pega o InputStream da Porta Serial
            inputStream = serialPort.getInputStream();

            outputStream = serialPort.getOutputStream();

            //Cria um novo Listener de Eventos
            serialPort.addEventListener(this);

            //Avisa se tive alguma mudança na Porta Serial
            serialPort.notifyOnDataAvailable(true);

            //Passa os parametros da porta serial
            serialPort.setSerialPortParams(boundRate, SerialPort.DATABITS_8,
                    SerialPort.STOPBITS_1,
                    SerialPort.PARITY_NONE);
            return true;
        } catch (PortInUseException | IOException | TooManyListenersException e) {
        } catch (UnsupportedCommOperationException e) {
            e.printStackTrace();

        }
        return false;

    }

    @Override
    public void serialEvent(SerialPortEvent event) {

        switch (event.getEventType()) {
            case SerialPortEvent.BI:
            case SerialPortEvent.OE:
            case SerialPortEvent.FE:
            case SerialPortEvent.PE:
            case SerialPortEvent.CD:
            case SerialPortEvent.CTS:
            case SerialPortEvent.DSR:
            case SerialPortEvent.RI:
            case SerialPortEvent.OUTPUT_BUFFER_EMPTY:
                break;
            case SerialPortEvent.DATA_AVAILABLE:
                //Se tiver dados disponíveis
                byte[] readBuffer = new byte[20];
                try {
                    int numBytes = 0;
                    while (inputStream.available() > 0) {
                        numBytes = inputStream.read(readBuffer);
                    }
                    String result = new String(readBuffer);
                    System.out.print(result);
                    resposta += result;

                } catch (IOException e) {
                }

                break;
        }
    }

    public void enviaComando(String comando) {
        resposta = "";
        try {
            outputStream.write(comando.getBytes());
        } catch (IOException ex) {
            System.out.println("Erro" + ex.getMessage());
        }
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public ArrayList<String> getListaPortas() {
        return listaPortas;
    }
}



