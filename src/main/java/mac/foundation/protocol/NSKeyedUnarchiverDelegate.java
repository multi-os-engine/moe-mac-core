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

package mac.foundation.protocol;


import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.foundation.NSArray;
import mac.foundation.NSKeyedUnarchiver;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSKeyedUnarchiverDelegate")
public interface NSKeyedUnarchiverDelegate {
	@Generated
	@IsOptional
	@Selector("unarchiver:cannotDecodeObjectOfClassName:originalClasses:")
	public Class unarchiverCannotDecodeObjectOfClassNameOriginalClasses(
			NSKeyedUnarchiver unarchiver, String name, NSArray classNames);

	@Generated
	@IsOptional
	@Selector("unarchiver:didDecodeObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object unarchiverDidDecodeObject(NSKeyedUnarchiver unarchiver,
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@IsOptional
	@Selector("unarchiver:willReplaceObject:withObject:")
	public void unarchiverWillReplaceObjectWithObject(
			NSKeyedUnarchiver unarchiver,
			@Mapped(ObjCObjectMapper.class) Object object,
			@Mapped(ObjCObjectMapper.class) Object newObject);

	@Generated
	@IsOptional
	@Selector("unarchiverDidFinish:")
	public void unarchiverDidFinish(NSKeyedUnarchiver unarchiver);

	@Generated
	@IsOptional
	@Selector("unarchiverWillFinish:")
	public void unarchiverWillFinish(NSKeyedUnarchiver unarchiver);
}
