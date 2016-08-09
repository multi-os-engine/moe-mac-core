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
public class NSMetadataQueryResultGroup extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMetadataQueryResultGroup(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMetadataQueryResultGroup alloc();

	@Generated
	@Selector("attribute")
	public native String attribute();

	@Generated
	@Selector("init")
	public native NSMetadataQueryResultGroup init();

	@Generated
	@Selector("resultAtIndex:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object resultAtIndex(long idx);

	@Generated
	@Selector("resultCount")
	public native long resultCount();

	@Generated
	@Selector("results")
	public native NSArray results();

	@Generated
	@Selector("subgroups")
	public native NSArray subgroups();

	@Generated
	@Selector("value")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object value();
}
