package emulator.cpu.bios;

import java.nio.ByteBuffer;

/**
 * Created by vicboma on 09/09/15.
 */
public class NintendoLogo {

    public static ByteBuffer ROM_DUMPED = ByteBuffer.wrap(new byte[]{
            (byte)0x31, (byte)0xFE, (byte)0xFF, (byte)0xAF, (byte)0x21, (byte)0xFF, (byte)0x9F, (byte)0x32,	(byte)0xCB, (byte)0x7C, (byte)0x20, (byte)0xFB, (byte)0x21, (byte)0x26, (byte)0xFF, (byte)0x0E,
            (byte)0x11, (byte)0x3E, (byte)0x80, (byte)0x32, (byte)0xE2, (byte)0x0C, (byte)0x3E, (byte)0xF3,	(byte)0xE2, (byte)0x32, (byte)0x3E, (byte)0x77, (byte)0x77, (byte)0x3E, (byte)0xFC, (byte)0xE0,
            (byte)0x47, (byte)0x11, (byte)0x04, (byte)0x01, (byte)0x21, (byte)0x10, (byte)0x80, (byte)0x1A,	(byte)0xCD, (byte)0x95, (byte)0x00, (byte)0xCD, (byte)0x96, (byte)0x00, (byte)0x13, (byte)0x7B,
            (byte)0xFE, (byte)0x34, (byte)0x20, (byte)0xF3, (byte)0x11, (byte)0xD8, (byte)0x00, (byte)0x06,	(byte)0x08, (byte)0x1A, (byte)0x13, (byte)0x22, (byte)0x23, (byte)0x05, (byte)0x20, (byte)0xF9,
            (byte)0x3E, (byte)0x19, (byte)0xEA, (byte)0x10, (byte)0x99, (byte)0x21, (byte)0x2F, (byte)0x99,	(byte)0x0E, (byte)0x0C, (byte)0x3D, (byte)0x28, (byte)0x08, (byte)0x32, (byte)0x0D, (byte)0x20,
            (byte)0xF9, (byte)0x2E, (byte)0x0F, (byte)0x18, (byte)0xF3, (byte)0x67, (byte)0x3E, (byte)0x64,	(byte)0x57, (byte)0xE0, (byte)0x42, (byte)0x3E, (byte)0x91, (byte)0xE0, (byte)0x40, (byte)0x04,
            (byte)0x1E, (byte)0x02, (byte)0x0E, (byte)0x0C, (byte)0xF0, (byte)0x44, (byte)0xFE, (byte)0x90,	(byte)0x20, (byte)0xFA, (byte)0x0D, (byte)0x20, (byte)0xF7, (byte)0x1D, (byte)0x20, (byte)0xF2,
            (byte)0x0E, (byte)0x13, (byte)0x24, (byte)0x7C, (byte)0x1E, (byte)0x83, (byte)0xFE, (byte)0x62,	(byte)0x28, (byte)0x06, (byte)0x1E, (byte)0xC1, (byte)0xFE, (byte)0x64, (byte)0x20, (byte)0x06,
            (byte)0x7B, (byte)0xE2, (byte)0x0C, (byte)0x3E, (byte)0x87, (byte)0xE2, (byte)0xF0, (byte)0x42,	(byte)0x90, (byte)0xE0, (byte)0x42, (byte)0x15, (byte)0x20, (byte)0xD2, (byte)0x05, (byte)0x20,
            (byte)0x4F, (byte)0x16, (byte)0x20, (byte)0x18, (byte)0xCB, (byte)0x4F, (byte)0x06, (byte)0x04,	(byte)0xC5, (byte)0xCB, (byte)0x11, (byte)0x17, (byte)0xC1, (byte)0xCB, (byte)0x11, (byte)0x17,
            (byte)0x05, (byte)0x20, (byte)0xF5, (byte)0x22, (byte)0x23, (byte)0x22, (byte)0x23, (byte)0xC9,	(byte)0xCE, (byte)0xED, (byte)0x66, (byte)0x66, (byte)0xCC, (byte)0x0D, (byte)0x00, (byte)0x0B,
            (byte)0x03, (byte)0x73, (byte)0x00, (byte)0x83, (byte)0x00, (byte)0x0C, (byte)0x00, (byte)0x0D,	(byte)0x00, (byte)0x08, (byte)0x11, (byte)0x1F, (byte)0x88, (byte)0x89, (byte)0x00, (byte)0x0E,
            (byte)0xDC, (byte)0xCC, (byte)0x6E, (byte)0xE6, (byte)0xDD, (byte)0xDD, (byte)0xD9, (byte)0x99,	(byte)0xBB, (byte)0xBB, (byte)0x67, (byte)0x63, (byte)0x6E, (byte)0x0E, (byte)0xEC, (byte)0xCC,
            (byte)0xDD, (byte)0xDC, (byte)0x99, (byte)0x9F, (byte)0xBB, (byte)0xB9, (byte)0x33, (byte)0x3E,	(byte)0x3C, (byte)0x42, (byte)0xB9, (byte)0xA5, (byte)0xB9, (byte)0xA5, (byte)0x42, (byte)0x3C,
            (byte)0x21, (byte)0x04, (byte)0x01, (byte)0x11, (byte)0xA8, (byte)0x00, (byte)0x1A, (byte)0x13,	(byte)0xBE, (byte)0x20, (byte)0xFE, (byte)0x23, (byte)0x7D, (byte)0xFE, (byte)0x34, (byte)0x20,
            (byte)0xF5, (byte)0x06, (byte)0x19, (byte)0x78, (byte)0x86, (byte)0x23, (byte)0x05, (byte)0x20,	(byte)0xFB, (byte)0x86, (byte)0x20, (byte)0xFE, (byte)0x3E, (byte)0x01, (byte)0xE0, (byte)0x50
    });
}