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
public class NSCache extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSCache(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSCache alloc();

	@Generated
	@Selector("countLimit")
	public native long countLimit();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("evictsObjectsWithDiscardedContent")
	public native boolean evictsObjectsWithDiscardedContent();

	@Generated
	@Selector("init")
	public native NSCache init();

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("objectForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectForKey(@Mapped(ObjCObjectMapper.class) Object key);

	@Generated
	@Selector("removeAllObjects")
	public native void removeAllObjects();

	@Generated
	@Selector("removeObjectForKey:")
	public native void removeObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object key);

	@Generated
	@Selector("setCountLimit:")
	public native void setCountLimit(long lim);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(@Mapped(ObjCObjectMapper.class) Object d);

	@Generated
	@Selector("setEvictsObjectsWithDiscardedContent:")
	public native void setEvictsObjectsWithDiscardedContent(boolean b);

	@Generated
	@Selector("setName:")
	public native void setName(String n);

	@Generated
	@Selector("setObject:forKey:")
	public native void setObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object obj,
			@Mapped(ObjCObjectMapper.class) Object key);

	@Generated
	@Selector("setObject:forKey:cost:")
	public native void setObjectForKeyCost(
			@Mapped(ObjCObjectMapper.class) Object obj,
			@Mapped(ObjCObjectMapper.class) Object key, long g);

	@Generated
	@Selector("setTotalCostLimit:")
	public native void setTotalCostLimit(long lim);

	@Generated
	@Selector("totalCostLimit")
	public native long totalCostLimit();
}
