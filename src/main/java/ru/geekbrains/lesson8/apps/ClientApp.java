package ru.geekbrains.lesson8.apps;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Java Core. Advanced level. Lesson 8
 *
 * @author Zurbaevi Nika
 */
public class ClientApp {

    public ClientApp() {
        try {
            Socket socket = new Socket("localhost", 8081);
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            new Thread(() -> {
                try {
                    while (true) {
                        String message = dataInputStream.readUTF();
                        System.out.println(message);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                try {
                    dataOutputStream.writeUTF(scanner.nextLine());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
