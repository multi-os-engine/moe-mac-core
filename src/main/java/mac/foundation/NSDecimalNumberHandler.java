/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package mac.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSDecimalNumberBehaviors;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDecimalNumberHandler extends NSObject implements
		NSDecimalNumberBehaviors, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDecimalNumberHandler(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDecimalNumberHandler alloc();

	@Generated
	@Selector("decimalNumberHandlerWithRoundingMode:scale:raiseOnExactness:raiseOnOverflow:raiseOnUnderflow:raiseOnDivideByZero:")
	public static native NSDecimalNumberHandler decimalNumberHandlerWithRoundingModeScaleRaiseOnExactnessRaiseOnOverflowRaiseOnUnderflowRaiseOnDivideByZero(
			long roundingMode, short scale, boolean exact, boolean overflow,
			boolean underflow, boolean divideByZero);

	@Generated
	@Selector("defaultDecimalNumberHandler")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object defaultDecimalNumberHandler();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("exceptionDuringOperation:error:leftOperand:rightOperand:")
	public native NSDecimalNumber exceptionDuringOperationErrorLeftOperandRightOperand(
			SEL operation, long error, NSDecimalNumber leftOperand,
			NSDecimalNumber rightOperand);

	@Generated
	@Selector("init")
	public native NSDecimalNumberHandler init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithRoundingMode:scale:raiseOnExactness:raiseOnOverflow:raiseOnUnderflow:raiseOnDivideByZero:")
	public native NSDecimalNumberHandler initWithRoundingModeScaleRaiseOnExactnessRaiseOnOverflowRaiseOnUnderflowRaiseOnDivideByZero(
			long roundingMode, short scale, boolean exact, boolean overflow,
			boolean underflow, boolean divideByZero);

	@Generated
	@Selector("roundingMode")
	public native long roundingMode();

	@Generated
	@Selector("scale")
	public native short scale();
}
