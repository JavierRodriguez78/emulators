package emulator.cpu.processor.command.bits8;

import cpu.processor.Z80;
import cpu.processor.command.CommandsImpl;

/**
 * Created by vicboma on 14/08/15.
 */
public class LDI_HL_A extends CommandsImpl {

    /**
     * Put A into memory address HL. Increment HL. Same as: LD (HL),A - INC HL -  22
     */
    public LDI_HL_A(Z80 z80) {
        super(z80);
    }

    @Override
    public void runAsync(int opCode1, int opCode2, int opCode3, int opCode4) {
        super.addressWrite(z80.hl, z80.a, 1, 8);
        super.incremetRegisterHL();
    }
}