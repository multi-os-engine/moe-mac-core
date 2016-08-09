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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.foundation.NSKeyedArchiver;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSKeyedArchiverDelegate")
public interface NSKeyedArchiverDelegate {
	@Generated
	@IsOptional
	@Selector("archiver:didEncodeObject:")
	public void archiverDidEncodeObject(NSKeyedArchiver archiver,
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@IsOptional
	@Selector("archiver:willEncodeObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object archiverWillEncodeObject(NSKeyedArchiver archiver,
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@IsOptional
	@Selector("archiver:willReplaceObject:withObject:")
	public void archiverWillReplaceObjectWithObject(NSKeyedArchiver archiver,
			@Mapped(ObjCObjectMapper.class) Object object,
			@Mapped(ObjCObjectMapper.class) Object newObject);

	@Generated
	@IsOptional
	@Selector("archiverDidFinish:")
	public void archiverDidFinish(NSKeyedArchiver archiver);

	@Generated
	@IsOptional
	@Selector("archiverWillFinish:")
	public void archiverWillFinish(NSKeyedArchiver archiver);
}
