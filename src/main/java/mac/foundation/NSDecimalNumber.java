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


import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.struct.NSRange;
import mac.quartzcore.struct.CATransform3D;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDecimalNumber extends NSNumber {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDecimalNumber(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDecimalNumber alloc();

	@Generated
	@Selector("compare:")
	public native long compare(NSNumber decimalNumber);

	@Generated
	@Selector("decimalNumberByAdding:")
	public native NSDecimalNumber decimalNumberByAdding(
			NSDecimalNumber decimalNumber);

	@Generated
	@Selector("decimalNumberByAdding:withBehavior:")
	public native NSDecimalNumber decimalNumberByAddingWithBehavior(
			NSDecimalNumber decimalNumber,
			@Mapped(ObjCObjectMapper.class) Object behavior);

	@Generated
	@Selector("decimalNumberByDividingBy:")
	public native NSDecimalNumber decimalNumberByDividingBy(
			NSDecimalNumber decimalNumber);

	@Generated
	@Selector("decimalNumberByDividingBy:withBehavior:")
	public native NSDecimalNumber decimalNumberByDividingByWithBehavior(
			NSDecimalNumber decimalNumber,
			@Mapped(ObjCObjectMapper.class) Object behavior);

	@Generated
	@Selector("decimalNumberByMultiplyingBy:")
	public native NSDecimalNumber decimalNumberByMultiplyingBy(
			NSDecimalNumber decimalNumber);

	@Generated
	@Selector("decimalNumberByMultiplyingBy:withBehavior:")
	public native NSDecimalNumber decimalNumberByMultiplyingByWithBehavior(
			NSDecimalNumber decimalNumber,
			@Mapped(ObjCObjectMapper.class) Object behavior);

	@Generated
	@Selector("decimalNumberByMultiplyingByPowerOf10:")
	public native NSDecimalNumber decimalNumberByMultiplyingByPowerOf10(
			short power);

	@Generated
	@Selector("decimalNumberByMultiplyingByPowerOf10:withBehavior:")
	public native NSDecimalNumber decimalNumberByMultiplyingByPowerOf10WithBehavior(
			short power, @Mapped(ObjCObjectMapper.class) Object behavior);

	@Generated
	@Selector("decimalNumberByRaisingToPower:")
	public native NSDecimalNumber decimalNumberByRaisingToPower(long power);

	@Generated
	@Selector("decimalNumberByRaisingToPower:withBehavior:")
	public native NSDecimalNumber decimalNumberByRaisingToPowerWithBehavior(
			long power, @Mapped(ObjCObjectMapper.class) Object behavior);

	@Generated
	@Selector("decimalNumberByRoundingAccordingToBehavior:")
	public native NSDecimalNumber decimalNumberByRoundingAccordingToBehavior(
			@Mapped(ObjCObjectMapper.class) Object behavior);

	@Generated
	@Selector("decimalNumberBySubtracting:")
	public native NSDecimalNumber decimalNumberBySubtracting(
			NSDecimalNumber decimalNumber);

	@Generated
	@Selector("decimalNumberBySubtracting:withBehavior:")
	public native NSDecimalNumber decimalNumberBySubtractingWithBehavior(
			NSDecimalNumber decimalNumber,
			@Mapped(ObjCObjectMapper.class) Object behavior);

	@Generated
	@Selector("decimalNumberWithMantissa:exponent:isNegative:")
	public static native NSDecimalNumber decimalNumberWithMantissaExponentIsNegative(
			long mantissa, short exponent, boolean flag);

	@Generated
	@Selector("decimalNumberWithString:")
	public static native NSDecimalNumber decimalNumberWithString(
			String numberValue);

	@Generated
	@Selector("decimalNumberWithString:locale:")
	public static native NSDecimalNumber decimalNumberWithStringLocale(
			String numberValue, @Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@Selector("defaultBehavior")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object defaultBehavior();

	@Generated
	@Selector("descriptionWithLocale:")
	public native String descriptionWithLocale(
			@Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@Selector("doubleValue")
	public native double doubleValue();

	@Generated
	@Selector("init")
	public native NSDecimalNumber init();

	@Generated
	@Selector("initWithBool:")
	public native NSDecimalNumber initWithBool(boolean value);

	@Generated
	@Selector("initWithBytes:objCType:")
	public native NSDecimalNumber initWithBytesObjCType(
			ConstVoidPtr value,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String type);

	@Generated
	@Selector("initWithChar:")
	public native NSDecimalNumber initWithChar(byte value);

	@Generated
	@Selector("initWithDouble:")
	public native NSDecimalNumber initWithDouble(double value);

	@Generated
	@Selector("initWithFloat:")
	public native NSDecimalNumber initWithFloat(float value);

	@Generated
	@Selector("initWithInt:")
	public native NSDecimalNumber initWithInt(int value);

	@Generated
	@Selector("initWithInteger:")
	public native NSDecimalNumber initWithInteger(long value);

	@Generated
	@Selector("initWithLong:")
	public native NSDecimalNumber initWithLong(long value);

	@Generated
	@Selector("initWithLongLong:")
	public native NSDecimalNumber initWithLongLong(long value);

	@Generated
	@Selector("initWithMantissa:exponent:isNegative:")
	public native NSDecimalNumber initWithMantissaExponentIsNegative(
			long mantissa, short exponent, boolean flag);

	@Generated
	@Selector("initWithShort:")
	public native NSDecimalNumber initWithShort(short value);

	@Generated
	@Selector("initWithString:")
	public native NSDecimalNumber initWithString(String numberValue);

	@Generated
	@Selector("initWithString:locale:")
	public native NSDecimalNumber initWithStringLocale(String numberValue,
			@Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@Selector("initWithUnsignedChar:")
	public native NSDecimalNumber initWithUnsignedChar(byte value);

	@Generated
	@Selector("initWithUnsignedInt:")
	public native NSDecimalNumber initWithUnsignedInt(int value);

	@Generated
	@Selector("initWithUnsignedInteger:")
	public native NSDecimalNumber initWithUnsignedInteger(long value);

	@Generated
	@Selector("initWithUnsignedLong:")
	public native NSDecimalNumber initWithUnsignedLong(long value);

	@Generated
	@Selector("initWithUnsignedLongLong:")
	public native NSDecimalNumber initWithUnsignedLongLong(long value);

	@Generated
	@Selector("initWithUnsignedShort:")
	public native NSDecimalNumber initWithUnsignedShort(short value);

	@Generated
	@Selector("maximumDecimalNumber")
	public static native NSDecimalNumber maximumDecimalNumber();

	@Generated
	@Selector("minimumDecimalNumber")
	public static native NSDecimalNumber minimumDecimalNumber();

	@Generated
	@Selector("notANumber")
	public static native NSDecimalNumber notANumber();

	@Generated
	@Selector("numberWithBool:")
	public static native NSNumber numberWithBool(boolean value);

	@Generated
	@Selector("numberWithChar:")
	public static native NSNumber numberWithChar(byte value);

	@Generated
	@Selector("numberWithDouble:")
	public static native NSNumber numberWithDouble(double value);

	@Generated
	@Selector("numberWithFloat:")
	public static native NSNumber numberWithFloat(float value);

	@Generated
	@Selector("numberWithInt:")
	public static native NSNumber numberWithInt(int value);

	@Generated
	@Selector("numberWithInteger:")
	public static native NSNumber numberWithInteger(long value);

	@Generated
	@Selector("numberWithLong:")
	public static native NSNumber numberWithLong(long value);

	@Generated
	@Selector("numberWithLongLong:")
	public static native NSNumber numberWithLongLong(long value);

	@Generated
	@Selector("numberWithShort:")
	public static native NSNumber numberWithShort(short value);

	@Generated
	@Selector("numberWithUnsignedChar:")
	public static native NSNumber numberWithUnsignedChar(byte value);

	@Generated
	@Selector("numberWithUnsignedInt:")
	public static native NSNumber numberWithUnsignedInt(int value);

	@Generated
	@Selector("numberWithUnsignedInteger:")
	public static native NSNumber numberWithUnsignedInteger(long value);

	@Generated
	@Selector("numberWithUnsignedLong:")
	public static native NSNumber numberWithUnsignedLong(long value);

	@Generated
	@Selector("numberWithUnsignedLongLong:")
	public static native NSNumber numberWithUnsignedLongLong(long value);

	@Generated
	@Selector("numberWithUnsignedShort:")
	public static native NSNumber numberWithUnsignedShort(short value);

	@Generated
	@Selector("objCType")
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	@MappedReturn(CStringMapper.class)
	public native String objCType();

	@Generated
	@Selector("one")
	public static native NSDecimalNumber one();

	@Generated
	@Selector("setDefaultBehavior:")
	public static native void setDefaultBehavior(
			@Mapped(ObjCObjectMapper.class) Object behavior);

	@Generated
	@Selector("value:withObjCType:")
	public static native NSValue valueWithObjCType(
			ConstVoidPtr value,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String type);

	@Generated
	@Selector("valueWithBytes:objCType:")
	public static native NSValue valueWithBytesObjCType(
			ConstVoidPtr value,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String type);

	@Generated
	@Selector("valueWithNonretainedObject:")
	public static native NSValue valueWithNonretainedObject(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("valueWithPoint:")
	public static native NSValue valueWithPoint(@ByValue CGPoint point);

	@Generated
	@Selector("valueWithPointer:")
	public static native NSValue valueWithPointer(ConstVoidPtr pointer);

	@Generated
	@Selector("valueWithRange:")
	public static native NSValue valueWithRange(@ByValue NSRange range);

	@Generated
	@Selector("valueWithRect:")
	public static native NSValue valueWithRect(@ByValue CGRect rect);

	@Generated
	@Selector("valueWithSize:")
	public static native NSValue valueWithSize(@ByValue CGSize size);

	@Generated
	@Selector("zero")
	public static native NSDecimalNumber zero();

	@Generated
	@Selector("valueWithCATransform3D:")
	public static native NSValue valueWithCATransform3D(@ByValue CATransform3D t);
}
