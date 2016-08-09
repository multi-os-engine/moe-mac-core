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

package mac.appkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.foundation.NSArray;
import mac.foundation.NSPredicate;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSObjectController extends NSController {
	static {
		NatJ.register();
	}

	@Generated
	protected NSObjectController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("add:")
	public native void add(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("addObject:")
	public native void addObject(@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSObjectController alloc();

	@Generated
	@Selector("automaticallyPreparesContent")
	public native boolean automaticallyPreparesContent();

	@Generated
	@Selector("canAdd")
	public native boolean canAdd();

	@Generated
	@Selector("canRemove")
	public native boolean canRemove();

	@Generated
	@Selector("content")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object content();

	@Generated
	@Selector("entityName")
	public native String entityName();

	@Generated
	@Selector("fetch:")
	public native void fetch(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("fetchPredicate")
	public native NSPredicate fetchPredicate();

	@Generated
	@Selector("init")
	public native NSObjectController init();

	@Generated
	@Selector("initWithContent:")
	public native NSObjectController initWithContent(
			@Mapped(ObjCObjectMapper.class) Object content);

	@Generated
	@Selector("isEditable")
	public native boolean isEditable();

	@Generated
	@Selector("newObject")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object newObject();

	@Generated
	@Selector("objectClass")
	public native Class objectClass();

	@Generated
	@Selector("prepareContent")
	public native void prepareContent();

	@Generated
	@Selector("remove:")
	public native void remove(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("removeObject:")
	public native void removeObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("selectedObjects")
	public native NSArray selectedObjects();

	@Generated
	@Selector("selection")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object selection();

	@Generated
	@Selector("setAutomaticallyPreparesContent:")
	public native void setAutomaticallyPreparesContent(boolean flag);

	@Generated
	@Selector("setContent:")
	public native void setContent(@Mapped(ObjCObjectMapper.class) Object content);

	@Generated
	@Selector("setEditable:")
	public native void setEditable(boolean flag);

	@Generated
	@Selector("setEntityName:")
	public native void setEntityName(String entityName);

	@Generated
	@Selector("setFetchPredicate:")
	public native void setFetchPredicate(NSPredicate predicate);

	@Generated
	@Selector("setObjectClass:")
	public native void setObjectClass(Class objectClass);

	@Generated
	@Selector("setUsesLazyFetching:")
	public native void setUsesLazyFetching(boolean enabled);

	@Generated
	@Selector("usesLazyFetching")
	public native boolean usesLazyFetching();

	@Generated
	@Selector("validateUserInterfaceItem:")
	public native boolean validateUserInterfaceItem(
			@Mapped(ObjCObjectMapper.class) Object item);
}
