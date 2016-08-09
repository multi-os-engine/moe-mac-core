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
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coreservices.struct.AEDesc;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSSecureCoding;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSAppleEventDescriptor extends NSObject implements NSCopying,
		NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSAppleEventDescriptor(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("aeDesc")
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native AEDesc aeDesc();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSAppleEventDescriptor alloc();

	@Generated
	@Selector("appleEventWithEventClass:eventID:targetDescriptor:returnID:transactionID:")
	public static native NSAppleEventDescriptor appleEventWithEventClassEventIDTargetDescriptorReturnIDTransactionID(
			int eventClass, int eventID,
			NSAppleEventDescriptor targetDescriptor, short returnID,
			int transactionID);

	@Generated
	@Selector("attributeDescriptorForKeyword:")
	public native NSAppleEventDescriptor attributeDescriptorForKeyword(
			int keyword);

	@Generated
	@Selector("booleanValue")
	public native byte booleanValue();

	@Generated
	@Selector("coerceToDescriptorType:")
	public native NSAppleEventDescriptor coerceToDescriptorType(
			int descriptorType);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("data")
	public native NSData data();

	@Generated
	@Selector("descriptorAtIndex:")
	public native NSAppleEventDescriptor descriptorAtIndex(long index);

	@Generated
	@Selector("descriptorForKeyword:")
	public native NSAppleEventDescriptor descriptorForKeyword(int keyword);

	@Generated
	@Selector("descriptorType")
	public native int descriptorType();

	@Generated
	@Selector("descriptorWithBoolean:")
	public static native NSAppleEventDescriptor descriptorWithBoolean(
			byte boolean_);

	@Generated
	@Selector("descriptorWithDescriptorType:bytes:length:")
	public static native NSAppleEventDescriptor descriptorWithDescriptorTypeBytesLength(
			int descriptorType, ConstVoidPtr bytes, long byteCount);

	@Generated
	@Selector("descriptorWithDescriptorType:data:")
	public static native NSAppleEventDescriptor descriptorWithDescriptorTypeData(
			int descriptorType, NSData data);

	@Generated
	@Selector("descriptorWithEnumCode:")
	public static native NSAppleEventDescriptor descriptorWithEnumCode(
			int enumerator);

	@Generated
	@Selector("descriptorWithInt32:")
	public static native NSAppleEventDescriptor descriptorWithInt32(
			int signedInt);

	@Generated
	@Selector("descriptorWithString:")
	public static native NSAppleEventDescriptor descriptorWithString(
			String string);

	@Generated
	@Selector("descriptorWithTypeCode:")
	public static native NSAppleEventDescriptor descriptorWithTypeCode(
			int typeCode);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("enumCodeValue")
	public native int enumCodeValue();

	@Generated
	@Selector("eventClass")
	public native int eventClass();

	@Generated
	@Selector("eventID")
	public native int eventID();

	@Generated
	@Selector("init")
	public native NSAppleEventDescriptor init();

	@Generated
	@Selector("initListDescriptor")
	public native NSAppleEventDescriptor initListDescriptor();

	@Generated
	@Selector("initRecordDescriptor")
	public native NSAppleEventDescriptor initRecordDescriptor();

	@Generated
	@Selector("initWithAEDescNoCopy:")
	public native NSAppleEventDescriptor initWithAEDescNoCopy(
			@UncertainArgument("Options: reference, array Fallback: reference") AEDesc aeDesc);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithDescriptorType:bytes:length:")
	public native NSAppleEventDescriptor initWithDescriptorTypeBytesLength(
			int descriptorType, ConstVoidPtr bytes, long byteCount);

	@Generated
	@Selector("initWithDescriptorType:data:")
	public native NSAppleEventDescriptor initWithDescriptorTypeData(
			int descriptorType, NSData data);

	@Generated
	@Selector("initWithEventClass:eventID:targetDescriptor:returnID:transactionID:")
	public native NSAppleEventDescriptor initWithEventClassEventIDTargetDescriptorReturnIDTransactionID(
			int eventClass, int eventID,
			NSAppleEventDescriptor targetDescriptor, short returnID,
			int transactionID);

	@Generated
	@Selector("insertDescriptor:atIndex:")
	public native void insertDescriptorAtIndex(
			NSAppleEventDescriptor descriptor, long index);

	@Generated
	@Selector("int32Value")
	public native int int32Value();

	@Generated
	@Selector("keywordForDescriptorAtIndex:")
	public native int keywordForDescriptorAtIndex(long index);

	@Generated
	@Selector("listDescriptor")
	public static native NSAppleEventDescriptor listDescriptor();

	@Generated
	@Selector("nullDescriptor")
	public static native NSAppleEventDescriptor nullDescriptor();

	@Generated
	@Selector("numberOfItems")
	public native long numberOfItems();

	@Generated
	@Selector("paramDescriptorForKeyword:")
	public native NSAppleEventDescriptor paramDescriptorForKeyword(int keyword);

	@Generated
	@Selector("recordDescriptor")
	public static native NSAppleEventDescriptor recordDescriptor();

	@Generated
	@Selector("removeDescriptorAtIndex:")
	public native void removeDescriptorAtIndex(long index);

	@Generated
	@Selector("removeDescriptorWithKeyword:")
	public native void removeDescriptorWithKeyword(int keyword);

	@Generated
	@Selector("removeParamDescriptorWithKeyword:")
	public native void removeParamDescriptorWithKeyword(int keyword);

	@Generated
	@Selector("returnID")
	public native short returnID();

	@Generated
	@Selector("setAttributeDescriptor:forKeyword:")
	public native void setAttributeDescriptorForKeyword(
			NSAppleEventDescriptor descriptor, int keyword);

	@Generated
	@Selector("setDescriptor:forKeyword:")
	public native void setDescriptorForKeyword(
			NSAppleEventDescriptor descriptor, int keyword);

	@Generated
	@Selector("setParamDescriptor:forKeyword:")
	public native void setParamDescriptorForKeyword(
			NSAppleEventDescriptor descriptor, int keyword);

	@Generated
	@Selector("stringValue")
	public native String stringValue();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("transactionID")
	public native int transactionID();

	@Generated
	@Selector("typeCodeValue")
	public native int typeCodeValue();
}
