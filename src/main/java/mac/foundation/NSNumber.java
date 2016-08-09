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
public class NSNumber extends NSValue {
	static {
		NatJ.register();
	}

	@Generated
	protected NSNumber(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSNumber alloc();

	@Generated
	@Selector("boolValue")
	public native boolean boolValue();

	@Generated
	@Selector("charValue")
	public native byte charValue();

	@Generated
	@Selector("compare:")
	public native long compare(NSNumber otherNumber);

	@Generated
	@Selector("descriptionWithLocale:")
	public native String descriptionWithLocale(
			@Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@Selector("doubleValue")
	public native double doubleValue();

	@Generated
	@Selector("floatValue")
	public native float floatValue();

	@Generated
	@Selector("init")
	public native NSNumber init();

	@Generated
	@Selector("initWithBool:")
	public native NSNumber initWithBool(boolean value);

	@Generated
	@Selector("initWithBytes:objCType:")
	public native NSNumber initWithBytesObjCType(
			ConstVoidPtr value,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String type);

	@Generated
	@Selector("initWithChar:")
	public native NSNumber initWithChar(byte value);

	@Generated
	@Selector("initWithDouble:")
	public native NSNumber initWithDouble(double value);

	@Generated
	@Selector("initWithFloat:")
	public native NSNumber initWithFloat(float value);

	@Generated
	@Selector("initWithInt:")
	public native NSNumber initWithInt(int value);

	@Generated
	@Selector("initWithInteger:")
	public native NSNumber initWithInteger(long value);

	@Generated
	@Selector("initWithLong:")
	public native NSNumber initWithLong(long value);

	@Generated
	@Selector("initWithLongLong:")
	public native NSNumber initWithLongLong(long value);

	@Generated
	@Selector("initWithShort:")
	public native NSNumber initWithShort(short value);

	@Generated
	@Selector("initWithUnsignedChar:")
	public native NSNumber initWithUnsignedChar(byte value);

	@Generated
	@Selector("initWithUnsignedInt:")
	public native NSNumber initWithUnsignedInt(int value);

	@Generated
	@Selector("initWithUnsignedInteger:")
	public native NSNumber initWithUnsignedInteger(long value);

	@Generated
	@Selector("initWithUnsignedLong:")
	public native NSNumber initWithUnsignedLong(long value);

	@Generated
	@Selector("initWithUnsignedLongLong:")
	public native NSNumber initWithUnsignedLongLong(long value);

	@Generated
	@Selector("initWithUnsignedShort:")
	public native NSNumber initWithUnsignedShort(short value);

	@Generated
	@Selector("intValue")
	public native int intValue();

	@Generated
	@Selector("integerValue")
	public native long integerValue();

	@Generated
	@Selector("isEqualToNumber:")
	public native boolean isEqualToNumber(NSNumber number);

	@Generated
	@Selector("longLongValue")
	public native long longLongValue();

	@Generated
	@Selector("longValue")
	public native long longValue();

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
	@Selector("shortValue")
	public native short shortValue();

	@Generated
	@Selector("stringValue")
	public native String stringValue();

	@Generated
	@Selector("unsignedCharValue")
	public native byte unsignedCharValue();

	@Generated
	@Selector("unsignedIntValue")
	public native int unsignedIntValue();

	@Generated
	@Selector("unsignedIntegerValue")
	public native long unsignedIntegerValue();

	@Generated
	@Selector("unsignedLongLongValue")
	public native long unsignedLongLongValue();

	@Generated
	@Selector("unsignedLongValue")
	public native long unsignedLongValue();

	@Generated
	@Selector("unsignedShortValue")
	public native short unsignedShortValue();

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
	@Selector("valueWithCATransform3D:")
	public static native NSValue valueWithCATransform3D(@ByValue CATransform3D t);
}
