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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSActionCell extends NSCell {
	static {
		NatJ.register();
	}

	@Generated
	protected NSActionCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("action")
	public native SEL action();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSActionCell alloc();

	@Generated
	@Selector("init")
	public native NSActionCell init();

	@Generated
	@Selector("initImageCell:")
	public native NSActionCell initImageCell(NSImage image);

	@Generated
	@Selector("initTextCell:")
	public native NSActionCell initTextCell(String aString);

	@Generated
	@Selector("setAction:")
	public native void setAction(SEL aSelector);

	@Generated
	@Selector("setTag:")
	public native void setTag(long anInt);

	@Generated
	@Selector("setTarget:")
	public native void setTarget(@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("tag")
	public native long tag();

	@Generated
	@Selector("target")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object target();
}
