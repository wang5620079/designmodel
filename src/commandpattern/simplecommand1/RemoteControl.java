package commandpattern.simplecommand1;

import commandpattern.Command;

/**
 * Created by wp-pc on 2018/9/17.
 */
public class RemoteControl {
    Command[] oncmmands;
    Command[] offcommands;

    public RemoteControl() {
        oncmmands = new Command[7];
        offcommands = new Command[7];
    }
    public void setOnCommand(int slot,Command cmd){
        try {
            if(slot>=0&&slot<7){
                oncmmands[slot]=cmd;
            }else{
                throw new Exception("数组越界");
            }
        }catch ( Exception e){
            e.printStackTrace();
        }
    }
    public void setOffcommand(int slot,Command cmd){
        try {
            if(slot>=0&&slot<7){
                offcommands[slot]=cmd;
            }else{
                throw new Exception("数组越界");
            }
        }catch ( Exception e){
            e.printStackTrace();
        }
    }
    public void setcommand(int slot,Command oncmd,Command offcmd){
        try {
            if(slot>=0&&slot<7){
                oncmmands[slot]=oncmd;
                offcommands[slot]=offcmd;
            }else{
                throw new Exception("数组越界");
            }
        }catch ( Exception e){
            e.printStackTrace();
        }
    }
    public void onbuttonpressed(int slot){
        try {
            if(slot>=0&&slot<7){
                if(oncmmands[slot] !=null){
                    oncmmands[slot].execute();
                }

            }else{
                throw new Exception("数组越界");
            }
        }catch ( Exception e){
            e.printStackTrace();
        }
    }
    public void offbuttonpressed(int slot){
        try {
            if(slot>=0&&slot<7){
                if(offcommands[slot] !=null){
                    offcommands[slot].execute();
                }
            }else{
                throw new Exception("数组越界");
            }
        }catch ( Exception e){
            e.printStackTrace();
        }
    }

    
}
