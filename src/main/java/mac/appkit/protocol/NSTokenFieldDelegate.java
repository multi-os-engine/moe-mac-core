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

package mac.appkit.protocol;


import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.NSMenu;
import mac.appkit.NSPasteboard;
import mac.appkit.NSTokenField;
import mac.foundation.NSArray;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTokenFieldDelegate")
public interface NSTokenFieldDelegate extends NSTextFieldDelegate {
	@Generated
	@IsOptional
	@Selector("tokenField:completionsForSubstring:indexOfToken:indexOfSelectedItem:")
	public NSArray tokenFieldCompletionsForSubstringIndexOfTokenIndexOfSelectedItem(
			NSTokenField tokenField, String substring, long tokenIndex,
			LongPtr selectedIndex);

	@Generated
	@IsOptional
	@Selector("tokenField:displayStringForRepresentedObject:")
	public String tokenFieldDisplayStringForRepresentedObject(
			NSTokenField tokenField,
			@Mapped(ObjCObjectMapper.class) Object representedObject);

	@Generated
	@IsOptional
	@Selector("tokenField:editingStringForRepresentedObject:")
	public String tokenFieldEditingStringForRepresentedObject(
			NSTokenField tokenField,
			@Mapped(ObjCObjectMapper.class) Object representedObject);

	@Generated
	@IsOptional
	@Selector("tokenField:hasMenuForRepresentedObject:")
	public boolean tokenFieldHasMenuForRepresentedObject(
			NSTokenField tokenField,
			@Mapped(ObjCObjectMapper.class) Object representedObject);

	@Generated
	@IsOptional
	@Selector("tokenField:menuForRepresentedObject:")
	public NSMenu tokenFieldMenuForRepresentedObject(NSTokenField tokenField,
			@Mapped(ObjCObjectMapper.class) Object representedObject);

	@Generated
	@IsOptional
	@Selector("tokenField:readFromPasteboard:")
	public NSArray tokenFieldReadFromPasteboard(NSTokenField tokenField,
			NSPasteboard pboard);

	@Generated
	@IsOptional
	@Selector("tokenField:representedObjectForEditingString:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object tokenFieldRepresentedObjectForEditingString(
			NSTokenField tokenField, String editingString);

	@Generated
	@IsOptional
	@Selector("tokenField:shouldAddObjects:atIndex:")
	public NSArray tokenFieldShouldAddObjectsAtIndex(NSTokenField tokenField,
			NSArray tokens, long index);

	@Generated
	@IsOptional
	@Selector("tokenField:styleForRepresentedObject:")
	public long tokenFieldStyleForRepresentedObject(NSTokenField tokenField,
			@Mapped(ObjCObjectMapper.class) Object representedObject);

	@Generated
	@IsOptional
	@Selector("tokenField:writeRepresentedObjects:toPasteboard:")
	public boolean tokenFieldWriteRepresentedObjectsToPasteboard(
			NSTokenField tokenField, NSArray objects, NSPasteboard pboard);
}
