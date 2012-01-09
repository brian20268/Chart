
/**
 * Write a description of class Chart here.
 * 
 * @Brian Eyring 
 * @Assignment 6.4
 */
public class Chart
{
   private String[][] shabadabado;
   private String activity;
   
   public Chart(String[][] contents){
       shabadabado = contents;
   }
   
   public String produceIT() {
       activity = "producing!";
       return doIT();
   }
   
   private String doIT() {
       activity = "DOING";
       return YES();
   }
   
   private String YES() {
       activity = "YESSSSSS!";
       return happyTimes();
   }
   
   private String happyTimes() {
       activity = "happy :)";
       return SHABAANG();
   }
   
   private String SHABAANG() {
       activity = "BANG CHART!";
       String rt = "";
       int labelWidth, dataWidth;
       for (String[] i : shabadabado){
           labelWidth = Math.max(i[0].length(), labelWidth);
           dataWidth = Math.max(i[1].length(), labelWidth);
       }
           
       // actually make the chart now
       for (String[] i : shabadabado){
           rt += String.format("%%ss | %%ss", labelWidth, i[0], dataWidth, i[1]);
        }
        
       return rt;
   }
   
   protected String getActivity() {
       // only my friends can see the activity i'm doing
       return activity;
   }
}
