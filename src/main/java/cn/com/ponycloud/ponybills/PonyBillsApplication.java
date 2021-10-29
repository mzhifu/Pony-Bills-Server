package cn.com.ponycloud.ponybills;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PonyBillsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PonyBillsApplication.class, args);
        String str = "██████╗  ██████╗ ███╗   ██╗██╗   ██╗     ██████╗ ██╗██╗     ██╗     ███████╗\n" +
                "██╔══██╗██╔═══██╗████╗  ██║╚██╗ ██╔╝     ██╔══██╗██║██║     ██║     ██╔════╝\n" +
                "██████╔╝██║   ██║██╔██╗ ██║ ╚████╔╝█████╗██████╔╝██║██║     ██║     ███████╗\n" +
                "██╔═══╝ ██║   ██║██║╚██╗██║  ╚██╔╝ ╚════╝██╔══██╗██║██║     ██║     ╚════██║\n" +
                "██║     ╚██████╔╝██║ ╚████║   ██║        ██████╔╝██║███████╗███████╗███████║\n" +
                "╚═╝      ╚═════╝ ╚═╝  ╚═══╝   ╚═╝        ╚═════╝ ╚═╝╚══════╝╚══════╝╚══════╝\n" +
                "                    Pony-Bills Start Successful                          ";
        System.out.println(str);
    }

}