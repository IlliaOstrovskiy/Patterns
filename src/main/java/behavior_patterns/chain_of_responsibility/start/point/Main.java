package behavior_patterns.chain_of_responsibility.start.point;

import behavior_patterns.chain_of_responsibility.call_center_help.CallCenterHandler;
import behavior_patterns.chain_of_responsibility.call_center_help.HelpHandler;
import behavior_patterns.chain_of_responsibility.call_center_help.RobotHandler;
import behavior_patterns.chain_of_responsibility.call_center_help.SpecialistHelpHandler;


public class Main {
    public static void main(String[] args) {
        HelpHandler helpHandler = new RobotHandler();
        helpHandler.linkWith(new CallCenterHandler())
                .linkWith(new SpecialistHelpHandler());

        helpHandler.help("RobotHelp");

        helpHandler.help("CallCenterHelp");

        helpHandler.help("SpecialistHelp");

        helpHandler.help("TooHardProblem");
    }
}
