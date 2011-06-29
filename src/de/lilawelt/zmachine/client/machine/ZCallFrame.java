/**
 * Copyright (c) 2008 Matthew E. Kimmel
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package de.lilawelt.zmachine.client.machine;

import java.io.Serializable;
import java.util.Stack;

/**
 * A frame on the ZMachine's call stack.
 *
 * @author Matt Kimmel
 */
public class ZCallFrame implements Serializable {
	private static final long serialVersionUID = 1L;
	// Constants used with calltype;
    static final int FUNCTION = 0;
    static final int PROCEDURE = 1;
    static final int INTERRUPT = 2;

    // Variables
    int pc; // Program counter
    Stack<Integer> routineStack; // Routine stack
    int[] localVars = new int[15]; // Local variables
    int numLocalVars; // Number of local variables
    int callType; // How this routine was called
    int argCount; // Argument count
	int frameNumber; // Used in CATCH and THROW.  First frame is 0, increases from there.
}
