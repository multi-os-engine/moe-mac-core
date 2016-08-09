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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSSecureCoding;
import mac.foundation.struct.NSRange;
import mac.quartzcore.struct.CATransform3D;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSValue extends NSObject implements NSCopying, NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSValue(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSValue alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("getValue:")
	public native void getValue(VoidPtr value);

	@Generated
	@Selector("init")
	public native NSValue init();

	@Generated
	@Selector("initWithBytes:objCType:")
	public native NSValue initWithBytesObjCType(
			ConstVoidPtr value,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String type);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("isEqualToValue:")
	public native boolean isEqualToValue(NSValue value);

	@Generated
	@Selector("nonretainedObjectValue")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object nonretainedObjectValue();

	@Generated
	@Selector("objCType")
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	@MappedReturn(CStringMapper.class)
	public native String objCType();

	@Generated
	@Selector("pointValue")
	@ByValue
	public native CGPoint pointValue();

	@Generated
	@Selector("pointerValue")
	public native VoidPtr pointerValue();

	@Generated
	@Selector("rangeValue")
	@ByValue
	public native NSRange rangeValue();

	@Generated
	@Selector("rectValue")
	@ByValue
	public native CGRect rectValue();

	@Generated
	@Selector("sizeValue")
	@ByValue
	public native CGSize sizeValue();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

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
	@Selector("CATransform3DValue")
	@ByValue
	public native CATransform3D CATransform3DValue();

	@Generated
	@Selector("valueWithCATransform3D:")
	public static native NSValue valueWithCATransform3D(@ByValue CATransform3D t);
}
