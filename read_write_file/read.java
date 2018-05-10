package read_write_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class read {

    public static void main(String[] args) {

        List<students> list = new ArrayList<students>();
        // read file
        try {
            BufferedReader br = new BufferedReader(new FileReader("/root/IdeaProjects/java-programming/src/read_write_file/StudentsInfo.txt"));

            String line = "";
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\t");

                students st = new students();
                st.setId(Integer.valueOf(data[0]));
                st.setName(data[1]);
                st.setDob(data[2]);

                list.add(st);
            }
            br.close();

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // write file
        students s1 = new students(20153452, "Cao Mai Linh", "12/4/1997");
        list.add(s1);
        try {
            File file = new File("/root/IdeaProjects/java-programming/src/read_write_file/results.txt");
//            if (!file.canWrite()) {
//                file.createNewFile();
//            }

            PrintWriter pw = new PrintWriter(new FileOutputStream(file));

            for (students s : list){
                pw.println(s.getId()+"\t"+s.getName()+"\t"+s.getDob());
            }
            pw.close();

            System.out.println("wrote!");

        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
