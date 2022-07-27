package Logs;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author arame    public void LogBitacora(String error,String pantalla,S
 */
public class log {
    public void LogBitacora(String error,String pantalla,String Boton) {
        Date fecha = new java.util.Date();                  
        DateFormat f = new SimpleDateFormat("yyy-MM-dd");        
        
        //HORA
        Calendar calendario = Calendar.getInstance();
        
        int hora, min, seg;
        
        //Obtener la hora, minutos y segundos 
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        min = calendario.get(Calendar.MINUTE);
        seg = calendario.get(Calendar.SECOND);
        
        //concatenar las 3 variables 
        String hour = String.valueOf(hora+""+min+""+seg);        
                
        String screen = pantalla;
        String btn = Boton;
        String fileName = ".\\src\\" + screen + "-" + btn + "-" + f.format(fecha) + "-" + hour + ".log";       

        try {
            PrintStream ps = new PrintStream(new BufferedOutputStream(
                    new FileOutputStream(new File(fileName), false)), false);
            java.util.Date fecha2 = new java.util.Date();
            DateFormat f2 = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
            String fechaActual = f2.format(fecha2);
            ps.println(fechaActual + "--" + error);

            ps.close();

            System.setOut(ps);
            System.setErr(ps);
            System.out.println(fileName);

        } catch (FileNotFoundException ex) {
            System.err.println("Se ha producido una excepción file fallo" + ex);            
        }
    }
    
    public void LogUsuarios(String pantalla,String Boton, String Usuario) {
        Date fecha = new java.util.Date();                  
        DateFormat f = new SimpleDateFormat("yyy-MM-dd");        
        
        //HORA
        Calendar calendario = Calendar.getInstance();
        
        int hora, min, seg;
        
        //Obtener la hora, minutos y segundos 
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        min = calendario.get(Calendar.MINUTE);
        seg = calendario.get(Calendar.SECOND);
        
        //concatenar las 3 variables 
        String hour = String.valueOf(hora+""+min+""+seg);        
                
        String screen = pantalla;
        String btn = Boton;
        String fileName = ".\\src\\" + screen + "-" + btn + "-" + f.format(fecha) + "-" + hour + ".log";       

        try {
            PrintStream ps = new PrintStream(new BufferedOutputStream(
                    new FileOutputStream(new File(fileName), false)), false);
            java.util.Date fecha2 = new java.util.Date();
            DateFormat f2 = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
            String fechaActual = f2.format(fecha2);
            ps.println(fechaActual + "--" + Usuario + "--" + "Intento acceso a: " + Boton);

            ps.close();

            System.setOut(ps);
            //System.setErr(ps);
            System.out.println(fileName);

        } catch (FileNotFoundException ex) {
            System.err.println("Se ha producido una excepción file fallo" + ex);            
        }
    }
}
