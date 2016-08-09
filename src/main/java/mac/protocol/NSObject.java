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

package mac.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSObject")
public interface NSObject {
	@Generated
	@Selector("autorelease")
	@MappedReturn(ObjCObjectMapper.class)
	public Object autorelease();

	@Generated
	@Selector("class")
	public Class class_objc();

	@Generated
	@IsOptional
	@Selector("debugDescription")
	public String debugDescription();

	@Generated
	@Selector("description")
	public String description();

	@Generated
	@Selector("hash")
	public long hash();

	@Generated
	@Selector("isEqual:")
	public boolean isEqual(@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("isKindOfClass:")
	public boolean isKindOfClass(Class aClass);

	@Generated
	@Selector("isMemberOfClass:")
	public boolean isMemberOfClass(Class aClass);

	@Generated
	@Selector("isProxy")
	public boolean isProxy();

	@Generated
	@Selector("performSelector:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object performSelector(SEL aSelector);

	@Generated
	@Selector("performSelector:withObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object performSelectorWithObject(SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("performSelector:withObject:withObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object performSelectorWithObjectWithObject(SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object object1,
			@Mapped(ObjCObjectMapper.class) Object object2);

	@Generated
	@Selector("release")
	public void release();

	@Generated
	@Selector("respondsToSelector:")
	public boolean respondsToSelector(SEL aSelector);

	@Generated
	@Selector("retain")
	@MappedReturn(ObjCObjectMapper.class)
	public Object retain();

	@Generated
	@Selector("retainCount")
	public long retainCount();

	@Generated
	@Selector("self")
	@MappedReturn(ObjCObjectMapper.class)
	public Object self();

	@Generated
	@Selector("superclass")
	public Class superclass();

	@Generated
	@Selector("zone")
	public VoidPtr zone();
}
