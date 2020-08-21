public class ProcessAPI {

    public static void main(String[] args){

        ProcessHandle mProcessHandle = ProcessHandle.current();

        System.out.println(mProcessHandle.pid());

    }

}
