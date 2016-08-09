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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.foundation.NSArray;
import mac.foundation.NSDictionary;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDictionaryController extends NSArrayController {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDictionaryController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDictionaryController alloc();

	@Generated
	@Selector("excludedKeys")
	public native NSArray excludedKeys();

	@Generated
	@Selector("includedKeys")
	public native NSArray includedKeys();

	@Generated
	@Selector("init")
	public native NSDictionaryController init();

	@Generated
	@Selector("initWithContent:")
	public native NSDictionaryController initWithContent(
			@Mapped(ObjCObjectMapper.class) Object content);

	@Generated
	@Selector("initialKey")
	public native String initialKey();

	@Generated
	@Selector("initialValue")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initialValue();

	@Generated
	@Selector("localizedKeyDictionary")
	public native NSDictionary localizedKeyDictionary();

	@Generated
	@Selector("localizedKeyTable")
	public native String localizedKeyTable();

	@Generated
	@Selector("newObject")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object newObject();

	@Generated
	@Selector("setExcludedKeys:")
	public native void setExcludedKeys(NSArray keys);

	@Generated
	@Selector("setIncludedKeys:")
	public native void setIncludedKeys(NSArray keys);

	@Generated
	@Selector("setInitialKey:")
	public native void setInitialKey(String key);

	@Generated
	@Selector("setInitialValue:")
	public native void setInitialValue(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setLocalizedKeyDictionary:")
	public native void setLocalizedKeyDictionary(NSDictionary dictionary);

	@Generated
	@Selector("setLocalizedKeyTable:")
	public native void setLocalizedKeyTable(String stringsFileName);
}
