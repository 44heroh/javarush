package task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/*
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
//            File your_file_name = File.createTempFile("your_file_name", null);
            File your_file_name = new File("C:\\Users\\User\\IntelliJIDEAProjects\\javarush\\src\\task20\\task2002\\file.txt");
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User usr = new User();
            usr.setFirstName("Ivan");
            usr.setLastName("Ivanov");
            usr.setBirthDate(new GregorianCalendar(1980, 11, 25).getTime());
            usr.setCountry(User.Country.RUSSIA);
            usr.setMale(true);

            User user = new User();
            user.setFirstName("Rubi");
            user.setLastName("Rail");
            user.setBirthDate(new Date(1508944516168L));
            user.setMale(true);
            user.setCountry(User.Country.OTHER);

            User user1 = new User();
            user1.setFirstName("Vasa1");
            user1.setLastName("Peta1");
            user1.setBirthDate(new Date(1508944516163L));
            user1.setMale(true);
            user1.setCountry(User.Country.RUSSIA);

            User user3 = new User();
            user3.setFirstName("Solo");
            user3.setLastName("Han");
            user3.setBirthDate(new Date(1508944516169L));
            user3.setMale(true);
            user3.setCountry(User.Country.UKRAINE);

            javaRush.users.add(usr);
            javaRush.users.add(user);
            javaRush.users.add(user1);
            javaRush.users.add(user3);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод

            Writer out = new OutputStreamWriter(outputStream, "UTF8");
            for(User user : users){
                String firstName = user.getFirstName() == null ? "NULL" : user.getFirstName();
                out.write(firstName + " ");
                String lastName = user.getLastName() == null ? "NULL" : user.getLastName();
                out.write(lastName + " ");
                Long birthDate = user.getBirthDate() != null ? user.getBirthDate().getTime() : null;
                out.write(birthDate + " ");
                String isMale = String.valueOf(user.isMale()) != null ? String.valueOf(user.isMale()) : "NULL";
                out.write(isMale + " ");
                String country = String.valueOf(user.getCountry().name()) != null ? String.valueOf(user.getCountry().name()) : "NULL";
                out.write(country + "\r\n");
            }
            out.close();
            for (User user : users){
                System.out.println(user.getLastName());
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
            while (in.ready()){
                User user = new User();
                String str = in.readLine();
                String strSplit[] = str.split(" ");
                String firstName = strSplit[0] != "NULL" ? strSplit[0] : "NULL";
                user.setFirstName(firstName);
                String lastName = strSplit[1] != "NULL" ? strSplit[1] : "NULL";
                user.setLastName(firstName);
                String birthDate = strSplit[2] != "NULL" ? strSplit[2] : "NULL";
                Date docDate = new Date(Long.parseLong(birthDate));
                user.setBirthDate(docDate);
                String isMail = strSplit[3] != "NULL" ? strSplit[3] : "NULL";
                user.setMale(Boolean.parseBoolean(isMail));
                String country = strSplit[4] != "NULL" ? strSplit[4] : "NULL";
                user.setCountry(User.Country.valueOf(strSplit[4]));
                users.add(user);
            }
            in.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
