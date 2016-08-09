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
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.NSColor;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCoder extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSCoder(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSCoder alloc();

	@Generated
	@Selector("allowedClasses")
	public native NSSet allowedClasses();

	@Generated
	@Selector("allowsKeyedCoding")
	public native boolean allowsKeyedCoding();

	@Generated
	@Selector("containsValueForKey:")
	public native boolean containsValueForKey(String key);

	@Generated
	@Selector("decodeArrayOfObjCType:count:at:")
	public native void decodeArrayOfObjCTypeCountAt(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String itemType,
			long count, VoidPtr array);

	@Generated
	@Selector("decodeBoolForKey:")
	public native boolean decodeBoolForKey(String key);

	@Generated
	@Selector("decodeBytesForKey:returnedLength:")
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	@MappedReturn(CStringMapper.class)
	public native String decodeBytesForKeyReturnedLength(String key,
			LongPtr lengthp);

	@Generated
	@Selector("decodeBytesWithReturnedLength:")
	public native VoidPtr decodeBytesWithReturnedLength(LongPtr lengthp);

	@Generated
	@Selector("decodeDataObject")
	public native NSData decodeDataObject();

	@Generated
	@Selector("decodeDoubleForKey:")
	public native double decodeDoubleForKey(String key);

	@Generated
	@Selector("decodeFloatForKey:")
	public native float decodeFloatForKey(String key);

	@Generated
	@Selector("decodeInt32ForKey:")
	public native int decodeInt32ForKey(String key);

	@Generated
	@Selector("decodeInt64ForKey:")
	public native long decodeInt64ForKey(String key);

	@Generated
	@Selector("decodeIntForKey:")
	public native int decodeIntForKey(String key);

	@Generated
	@Selector("decodeIntegerForKey:")
	public native long decodeIntegerForKey(String key);

	@Generated
	@Selector("decodeNXObject")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object decodeNXObject();

	@Generated
	@Selector("decodeObject")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object decodeObject();

	@Generated
	@Selector("decodeObjectForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object decodeObjectForKey(String key);

	@Generated
	@Selector("decodeObjectOfClass:forKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object decodeObjectOfClassForKey(Class aClass, String key);

	@Generated
	@Selector("decodeObjectOfClasses:forKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object decodeObjectOfClassesForKey(NSSet classes, String key);

	@Generated
	@Selector("decodePoint")
	@ByValue
	public native CGPoint decodePoint();

	@Generated
	@Selector("decodePointForKey:")
	@ByValue
	public native CGPoint decodePointForKey(String key);

	@Generated
	@Selector("decodePropertyList")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object decodePropertyList();

	@Generated
	@Selector("decodePropertyListForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object decodePropertyListForKey(String key);

	@Generated
	@Selector("decodeRect")
	@ByValue
	public native CGRect decodeRect();

	@Generated
	@Selector("decodeRectForKey:")
	@ByValue
	public native CGRect decodeRectForKey(String key);

	@Generated
	@Selector("decodeSize")
	@ByValue
	public native CGSize decodeSize();

	@Generated
	@Selector("decodeSizeForKey:")
	@ByValue
	public native CGSize decodeSizeForKey(String key);

	@Generated
	@Selector("decodeValueOfObjCType:at:")
	public native void decodeValueOfObjCTypeAt(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String type,
			VoidPtr data);

	@Generated
	@Selector("encodeArrayOfObjCType:count:at:")
	public native void encodeArrayOfObjCTypeCountAt(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String type,
			long count, ConstVoidPtr array);

	@Generated
	@Selector("encodeBool:forKey:")
	public native void encodeBoolForKey(boolean boolv, String key);

	@Generated
	@Selector("encodeBycopyObject:")
	public native void encodeBycopyObject(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("encodeByrefObject:")
	public native void encodeByrefObject(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("encodeBytes:length:")
	public native void encodeBytesLength(ConstVoidPtr byteaddr, long length);

	@Generated
	@Selector("encodeBytes:length:forKey:")
	public native void encodeBytesLengthForKey(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String bytesp,
			long lenv, String key);

	@Generated
	@Selector("encodeConditionalObject:")
	public native void encodeConditionalObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("encodeConditionalObject:forKey:")
	public native void encodeConditionalObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object objv, String key);

	@Generated
	@Selector("encodeDataObject:")
	public native void encodeDataObject(NSData data);

	@Generated
	@Selector("encodeDouble:forKey:")
	public native void encodeDoubleForKey(double realv, String key);

	@Generated
	@Selector("encodeFloat:forKey:")
	public native void encodeFloatForKey(float realv, String key);

	@Generated
	@Selector("encodeInt32:forKey:")
	public native void encodeInt32ForKey(int intv, String key);

	@Generated
	@Selector("encodeInt64:forKey:")
	public native void encodeInt64ForKey(long intv, String key);

	@Generated
	@Selector("encodeInt:forKey:")
	public native void encodeIntForKey(int intv, String key);

	@Generated
	@Selector("encodeInteger:forKey:")
	public native void encodeIntegerForKey(long intv, String key);

	@Generated
	@Selector("encodeNXObject:")
	public native void encodeNXObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("encodeObject:")
	public native void encodeObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("encodeObject:forKey:")
	public native void encodeObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object objv, String key);

	@Generated
	@Selector("encodePoint:")
	public native void encodePoint(@ByValue CGPoint point);

	@Generated
	@Selector("encodePoint:forKey:")
	public native void encodePointForKey(@ByValue CGPoint point, String key);

	@Generated
	@Selector("encodePropertyList:")
	public native void encodePropertyList(
			@Mapped(ObjCObjectMapper.class) Object aPropertyList);

	@Generated
	@Selector("encodeRect:")
	public native void encodeRect(@ByValue CGRect rect);

	@Generated
	@Selector("encodeRect:forKey:")
	public native void encodeRectForKey(@ByValue CGRect rect, String key);

	@Generated
	@Selector("encodeRootObject:")
	public native void encodeRootObject(
			@Mapped(ObjCObjectMapper.class) Object rootObject);

	@Generated
	@Selector("encodeSize:")
	public native void encodeSize(@ByValue CGSize size);

	@Generated
	@Selector("encodeSize:forKey:")
	public native void encodeSizeForKey(@ByValue CGSize size, String key);

	@Generated
	@Selector("encodeValueOfObjCType:at:")
	public native void encodeValueOfObjCTypeAt(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String type,
			ConstVoidPtr addr);

	@Generated
	@Selector("init")
	public native NSCoder init();

	@Generated
	@Selector("objectZone")
	public native VoidPtr objectZone();

	@Generated
	@Selector("requiresSecureCoding")
	public native boolean requiresSecureCoding();

	@Generated
	@Selector("setObjectZone:")
	public native void setObjectZone(VoidPtr zone);

	@Generated
	@Selector("systemVersion")
	public native int systemVersion();

	@Generated
	@Selector("versionForClassName:")
	public native long versionForClassName(String className);

	@Generated
	@Selector("decodeNXColor")
	public native NSColor decodeNXColor();
}
