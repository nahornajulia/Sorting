package scvproject;


public class Executor {

   
    public static void main(String[] args) {
    
        CSVSearch csvByName = new CSVSearchImpl(
        "ip,name,desc\n"+
        "10.49.1.4,server1,Main Server\n"+
        "10.52.5.1,server2,Backup Server\n",
        "name"); 
       
        System.out.println(csvByName.find("server2").getField("ip"));
        System.out.println(csvByName.find("server9"));
    }       
}
