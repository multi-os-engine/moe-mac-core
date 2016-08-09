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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPositionalSpecifier extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPositionalSpecifier(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPositionalSpecifier alloc();

	@Generated
	@Selector("evaluate")
	public native void evaluate();

	@Generated
	@Selector("init")
	public native NSPositionalSpecifier init();

	@Generated
	@Selector("initWithPosition:objectSpecifier:")
	public native NSPositionalSpecifier initWithPositionObjectSpecifier(
			long position, NSScriptObjectSpecifier specifier);

	@Generated
	@Selector("insertionContainer")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object insertionContainer();

	@Generated
	@Selector("insertionIndex")
	public native long insertionIndex();

	@Generated
	@Selector("insertionKey")
	public native String insertionKey();

	@Generated
	@Selector("insertionReplaces")
	public native boolean insertionReplaces();

	@Generated
	@Selector("objectSpecifier")
	public native NSScriptObjectSpecifier objectSpecifier();

	@Generated
	@Selector("position")
	public native long position();

	@Generated
	@Selector("setInsertionClassDescription:")
	public native void setInsertionClassDescription(
			NSScriptClassDescription classDescription);
}
