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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDataDetector extends NSRegularExpression {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDataDetector(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDataDetector alloc();

	@Generated
	@Selector("checkingTypes")
	public native long checkingTypes();

	@Generated
	@Selector("dataDetectorWithTypes:error:")
	public static native NSDataDetector dataDetectorWithTypesError(
			long checkingTypes, Ptr<NSError> error);

	@Generated
	@Selector("init")
	public native NSDataDetector init();

	@Generated
	@Selector("initWithPattern:options:error:")
	public native NSDataDetector initWithPatternOptionsError(String pattern,
			long options, Ptr<NSError> error);

	@Generated
	@Selector("initWithTypes:error:")
	public native NSDataDetector initWithTypesError(long checkingTypes,
			Ptr<NSError> error);

	@Generated
	@Selector("regularExpressionWithPattern:options:error:")
	public static native NSRegularExpression regularExpressionWithPatternOptionsError(
			String pattern, long options, Ptr<NSError> error);
}
