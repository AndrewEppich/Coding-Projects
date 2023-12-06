#include <iostream>

class MachVECU {
private:
    bool hydraulicJacksActivated;
    bool infraredLightsActivated;
    bool specialGripTiresActivated;
    bool autoJackActivated;

    void activateHydraulicJacks() {
        hydraulicJacksActivated = !hydraulicJacksActivated;
        std::cout << "Hydraulic Jacks " << (hydraulicJacksActivated ? "activated" : "deactivated") << std::endl;
    }

    void activateInfraredLights() {
        infraredLightsActivated = !infraredLightsActivated;
        std::cout << "Infrared Lights " << (infraredLightsActivated ? "activated" : "deactivated") << std::endl;
    }

    void activateSpecialGripTires() {
        specialGripTiresActivated = !specialGripTiresActivated;
        std::cout << "Special Grip Tires " << (specialGripTiresActivated ? "activated" : "deactivated") << std::endl;
    }

    void activateAutoJack() {
        if (autoJackActivated) {
            specialGripTiresActivated = !specialGripTiresActivated;
            std::cout << "Special Grip Tires deactivated due to Auto-Jack activation" << std::endl;
        } else {
            autoJackActivated = true;
            std::cout << "Auto-Jack activated" << std::endl;
        }
    }

public:
    MachVECU() : hydraulicJacksActivated(false), infraredLightsActivated(false),
                specialGripTiresActivated(false), autoJackActivated(false) {}

    ~MachVECU() {}

    void handleCommand(char command) {
        switch (command) {
            case 'A':
                activateHydraulicJacks();
                break;
            case 'B':
                activateSpecialGripTires();
                break;
            case 'C':
                activateInfraredLights();
                break;
            case 'D':
                activateAutoJack();
                break;
            case 'X':
                std::cout << "Turning off ignition. Program ending." << std::endl;

                break;
            default:
                std::cout << "Invalid command. Please enter A, B, C, D, or X." << std::endl;
        }
    }
};

int main() {
    MachVECU ecu;

    while (true) {
        std::cout << "Mach V Steering Wheel Controls:" << std::endl;
        std::cout << "A - Hydraulic Jacks | B - Special Grip Tires | C - Infrared Lights | D - Auto-Jack | X - Turn off ignition" << std::endl;
        std::cout << "          (A)         " << std::endl;
        std::cout << "      (F) (G) (B)     " << std::endl;
        std::cout << "      (E)     (C)     " << std::endl;
        std::cout << "          (D)         " << std::endl;


        char command;
        std::cin >> command;

        ecu.handleCommand(command);

        if (command == 'X') {
            break;
        }
    }

    return 0;
}
