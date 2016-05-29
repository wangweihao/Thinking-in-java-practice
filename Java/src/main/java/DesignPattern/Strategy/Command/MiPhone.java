package DesignPattern.Strategy.Command;

import java.util.ArrayList;

/**
 * Created by wwh on 16-5-29.
 */
public class MiPhone {
    ArrayList commands;

    public MiPhone() {
        commands = new ArrayList();
    }

    public void setCommand(Command command) {
        commands.add(command);
    }

    public void onButtonWasPushed(int slot) {
        ((Command)commands.get(slot-1)).execute();
    }

    public static void main(String[] args) {
        MiPhone miPhone = new MiPhone();
        //创建电器
        Light light = new Light();
        TV tv = new TV();
        //创建命令
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        //给小米手机设置命令
        //设置第一个按钮为开灯
        miPhone.setCommand(lightOnCommand);
        //设置第二个按钮为开电视
        miPhone.setCommand(tvOnCommand);

        //开灯
        miPhone.onButtonWasPushed(1);
        //开电视
        miPhone.onButtonWasPushed(2);
    }
}
