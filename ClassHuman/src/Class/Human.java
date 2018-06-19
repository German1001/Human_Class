package Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.Buffer;

public class Human {

    private String name;
    private String second;
    private byte age;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Human()throws IOException{
        setName();
        setSecond();
        setAge();
    }

    public void setName() throws IOException {
        System.out.println("Enter thhe name");
        this.name = reader.readLine();
    }
    public void setSecond() throws IOException {
        System.out.println("Enter the second");
        this.second = reader.readLine();
    }
    public void setAge() throws IOException {
        System.out.println("Enter the age");
        this.age = Byte.parseByte(reader.readLine());
    }

    public String getName(){return this.name;}
    public String getSecond(){return this.second;}
    public int getAge(){return this.age;}
}
