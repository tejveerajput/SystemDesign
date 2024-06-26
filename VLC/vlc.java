package VLC;
public class vlc extends Thread{
    boolean isopen;
    // public boolean open_vlc(){
    //     isopen=true;
    //     return true;
    // } public boolean close_vlc(){
    //     isopen=false;
    //     return true;
    // }
    @Override
    public void run(){
        if(isopen==false){
            isopen =true;
        }
        System.out.println("Try to open vlc");
        try{
            Thread.sleep(4000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Open vlc");
    }
}