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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSSecureCoding;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPredicate extends NSObject implements NSSecureCoding, NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPredicate(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPredicate alloc();

	@Generated
	@Selector("allowEvaluation")
	public native void allowEvaluation();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("evaluateWithObject:")
	public native boolean evaluateWithObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("evaluateWithObject:substitutionVariables:")
	public native boolean evaluateWithObjectSubstitutionVariables(
			@Mapped(ObjCObjectMapper.class) Object object, NSDictionary bindings);

	@Generated
	@Selector("init")
	public native NSPredicate init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("predicateFormat")
	public native String predicateFormat();

	@Generated
	@Selector("predicateFromMetadataQueryString:")
	public static native NSPredicate predicateFromMetadataQueryString(
			String queryString);

	@Generated
	@Selector("predicateWithBlock:")
	public static native NSPredicate predicateWithBlock(
			@ObjCBlock(name = "call_predicateWithBlock") Block_predicateWithBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_predicateWithBlock {
		@Generated
		public boolean call_predicateWithBlock(
				@Mapped(ObjCObjectMapper.class) Object arg0, NSDictionary arg1);
	}

	@Generated
	@Selector("predicateWithFormat:argumentArray:")
	public static native NSPredicate predicateWithFormatArgumentArray(
			String predicateFormat, NSArray arguments);

	@Generated
	@Selector("predicateWithSubstitutionVariables:")
	public native NSPredicate predicateWithSubstitutionVariables(
			NSDictionary variables);

	@Generated
	@Selector("predicateWithValue:")
	public static native NSPredicate predicateWithValue(boolean value);

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}
}
