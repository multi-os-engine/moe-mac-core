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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFormatter extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSFormatter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSFormatter alloc();

	@Generated
	@Selector("attributedStringForObjectValue:withDefaultAttributes:")
	public native NSAttributedString attributedStringForObjectValueWithDefaultAttributes(
			@Mapped(ObjCObjectMapper.class) Object obj, NSDictionary attrs);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("editingStringForObjectValue:")
	public native String editingStringForObjectValue(
			@Mapped(ObjCObjectMapper.class) Object obj);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("getObjectValue:forString:errorDescription:")
	public native boolean getObjectValueForStringErrorDescription(
			Ptr<? extends ObjCObject> obj, String string, Ptr<NSString> error);

	@Generated
	@Selector("init")
	public native NSFormatter init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("isPartialStringValid:newEditingString:errorDescription:")
	public native boolean isPartialStringValidNewEditingStringErrorDescription(
			String partialString, Ptr<NSString> newString, Ptr<NSString> error);

	@Generated
	@Selector("isPartialStringValid:proposedSelectedRange:originalString:originalSelectedRange:errorDescription:")
	public native boolean isPartialStringValidProposedSelectedRangeOriginalStringOriginalSelectedRangeErrorDescription(
			Ptr<NSString> partialStringPtr,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange proposedSelRangePtr,
			String origString, @ByValue NSRange origSelRange,
			Ptr<NSString> error);

	@Generated
	@Selector("stringForObjectValue:")
	public native String stringForObjectValue(
			@Mapped(ObjCObjectMapper.class) Object obj);
}
