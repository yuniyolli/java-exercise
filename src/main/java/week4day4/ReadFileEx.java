package week4day4;

import jdk.internal.org.jline.utils.InfoCmp;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static jdk.internal.org.jline.utils.InfoCmp.Capability.lines;

    /*

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/yunhwasim/Desktop/hospital.csv"), "EUC-KR"));
        System.out.println(br.readLine());

    }

     */

public class ReadFileEx {
    LineReader lineReader;
    Charset charset;
    Hospital hospital;


    public ReadFileEx(Charset charset) {
        this.charset = charset;
    }



    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();
/*
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8)) {\

 */
        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));


        String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);//읽어온 각 줄을 line리스트에 추가하는 구문
            }
        /*catch (IOException e) {
            throw new RuntimeException(e);
        }

         */
        return lines;
    }

    public Hospital parse(String str) {
        //System.out.println(str);
        String[] splitted = str.split(",");
        //System.out.println(Arrays.toString(splitted));
        Address address = new Address(splitted[10], splitted[5], splitted[7] );
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);

        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }



    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
        List<String> strLines = rfe.getLines("/Users/yunhwasim/Desktop/techit/lecture/WEEK1/0419/java-exercise/hospital_info_10lines_utf8.csv");
      //  List<String> result = rfe.getLines("/Users/yunhwasim/Desktop/hospital_info_0920_utf8.csv");
       //rfe.parse(result.get(0));
        List<Hospital> parsedHospital = rfe.getHospitals(strLines);
        //System.out.println(parsedHospital.get(0));

        for (int i = 0; i < parsedHospital.size(); i++) {
            Hospital hospital = parsedHospital.get(i);
            System.out.printf("%s %s %s\n", hospital.getName(), hospital.getWebsiteAddr(),hospital.getAddress().getFullAddr());

        }
       // for (int i = 0; i < 10; i++) {
        //    System.out.println(result.get(i));

        }
    }
