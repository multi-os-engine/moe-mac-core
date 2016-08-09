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
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCoding;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSScriptObjectSpecifier extends NSObject implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSScriptObjectSpecifier(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSScriptObjectSpecifier alloc();

	@Generated
	@Selector("childSpecifier")
	public native NSScriptObjectSpecifier childSpecifier();

	@Generated
	@Selector("containerClassDescription")
	public native NSScriptClassDescription containerClassDescription();

	@Generated
	@Selector("containerIsObjectBeingTested")
	public native boolean containerIsObjectBeingTested();

	@Generated
	@Selector("containerIsRangeContainerObject")
	public native boolean containerIsRangeContainerObject();

	@Generated
	@Selector("containerSpecifier")
	public native NSScriptObjectSpecifier containerSpecifier();

	@Generated
	@Selector("descriptor")
	public native NSAppleEventDescriptor descriptor();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("evaluationErrorNumber")
	public native long evaluationErrorNumber();

	@Generated
	@Selector("evaluationErrorSpecifier")
	public native NSScriptObjectSpecifier evaluationErrorSpecifier();

	@Generated
	@Selector("indicesOfObjectsByEvaluatingWithContainer:count:")
	public native LongPtr indicesOfObjectsByEvaluatingWithContainerCount(
			@Mapped(ObjCObjectMapper.class) Object container, LongPtr count);

	@Generated
	@Selector("init")
	public native NSScriptObjectSpecifier init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithContainerClassDescription:containerSpecifier:key:")
	public native NSScriptObjectSpecifier initWithContainerClassDescriptionContainerSpecifierKey(
			NSScriptClassDescription classDesc,
			NSScriptObjectSpecifier container, String property);

	@Generated
	@Selector("initWithContainerSpecifier:key:")
	public native NSScriptObjectSpecifier initWithContainerSpecifierKey(
			NSScriptObjectSpecifier container, String property);

	@Generated
	@Selector("key")
	public native String key();

	@Generated
	@Selector("keyClassDescription")
	public native NSScriptClassDescription keyClassDescription();

	@Generated
	@Selector("objectSpecifierWithDescriptor:")
	public static native NSScriptObjectSpecifier objectSpecifierWithDescriptor(
			NSAppleEventDescriptor descriptor);

	@Generated
	@Selector("objectsByEvaluatingSpecifier")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectsByEvaluatingSpecifier();

	@Generated
	@Selector("objectsByEvaluatingWithContainers:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectsByEvaluatingWithContainers(
			@Mapped(ObjCObjectMapper.class) Object containers);

	@Generated
	@Selector("setChildSpecifier:")
	public native void setChildSpecifier(NSScriptObjectSpecifier child);

	@Generated
	@Selector("setContainerClassDescription:")
	public native void setContainerClassDescription(
			NSScriptClassDescription classDesc);

	@Generated
	@Selector("setContainerIsObjectBeingTested:")
	public native void setContainerIsObjectBeingTested(boolean flag);

	@Generated
	@Selector("setContainerIsRangeContainerObject:")
	public native void setContainerIsRangeContainerObject(boolean flag);

	@Generated
	@Selector("setContainerSpecifier:")
	public native void setContainerSpecifier(NSScriptObjectSpecifier subRef);

	@Generated
	@Selector("setEvaluationErrorNumber:")
	public native void setEvaluationErrorNumber(long error);

	@Generated
	@Selector("setKey:")
	public native void setKey(String key);
}
