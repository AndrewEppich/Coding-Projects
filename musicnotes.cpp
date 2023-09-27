#include <iostream>
#include <cmath>
#include <iomanip>
#include <string>

int main() {
    double baseFrequency = 16.35;
    double speedOfSound = 34500;

    struct NoteInfo {
        std::string noteName;
        int octave;
        int noteIndex;
    };

    NoteInfo notesToPrint[] = {
        {"C", 0, 0},
        {"C#", 0, 1},
        {"D", 0, 2},
        {"C4", 4, 0},
        {"D#7", 7, 3},
        {"C8", 8, 0}
    };

    for (const NoteInfo& noteInfo : notesToPrint) {
        double frequency = baseFrequency * pow(2.0, (noteInfo.octave + noteInfo.noteIndex / 12.0));
        double wavelength = speedOfSound / frequency;

        std::cout << "Note: " << noteInfo.noteName << "; nu: " << noteInfo.octave
                  << "; k: " << noteInfo.noteIndex << "; frequency: " << std::fixed << std::setprecision(5) << frequency
                  << " Hz; wavelength: " << wavelength << " cm" << std::endl;
    }

    return 0;
}
