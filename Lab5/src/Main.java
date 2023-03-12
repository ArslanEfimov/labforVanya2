import Commands.CommandsProcessing;
import Exceptions.WrongValuesException;
import ParceFile.FileReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws WrongValuesException, IOException{
        FileReader fileReader = new FileReader();
        fileReader.readCollection(args[0]);
        try {
            CommandsProcessing commandsProcessing = new CommandsProcessing();
            commandsProcessing.switchCommands();
        } catch (NullPointerException e) {
            System.out.println("В коллекции содержится null элемент");
        }
    }

}