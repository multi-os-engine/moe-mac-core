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
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;
import mac.foundation.NSDictionary;
import mac.foundation.NSIndexSet;
import mac.foundation.NSPredicate;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSRuleEditor extends NSControl {
	static {
		NatJ.register();
	}

	@Generated
	protected NSRuleEditor(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addRow:")
	public native void addRow(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSRuleEditor alloc();

	@Generated
	@Selector("canRemoveAllRows")
	public native boolean canRemoveAllRows();

	@Generated
	@Selector("criteriaForRow:")
	public native NSArray criteriaForRow(long row);

	@Generated
	@Selector("criteriaKeyPath")
	public native String criteriaKeyPath();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("displayValuesForRow:")
	public native NSArray displayValuesForRow(long row);

	@Generated
	@Selector("displayValuesKeyPath")
	public native String displayValuesKeyPath();

	@Generated
	@Selector("formattingDictionary")
	public native NSDictionary formattingDictionary();

	@Generated
	@Selector("formattingStringsFilename")
	public native String formattingStringsFilename();

	@Generated
	@Selector("init")
	public native NSRuleEditor init();

	@Generated
	@Selector("initWithFrame:")
	public native NSRuleEditor initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("insertRowAtIndex:withType:asSubrowOfRow:animate:")
	public native void insertRowAtIndexWithTypeAsSubrowOfRowAnimate(
			long rowIndex, long rowType, long parentRow, boolean shouldAnimate);

	@Generated
	@Selector("isEditable")
	public native boolean isEditable();

	@Generated
	@Selector("nestingMode")
	public native long nestingMode();

	@Generated
	@Selector("numberOfRows")
	public native long numberOfRows();

	@Generated
	@Selector("parentRowForRow:")
	public native long parentRowForRow(long rowIndex);

	@Generated
	@Selector("predicate")
	public native NSPredicate predicate();

	@Generated
	@Selector("predicateForRow:")
	public native NSPredicate predicateForRow(long row);

	@Generated
	@Selector("reloadCriteria")
	public native void reloadCriteria();

	@Generated
	@Selector("reloadPredicate")
	public native void reloadPredicate();

	@Generated
	@Selector("removeRowAtIndex:")
	public native void removeRowAtIndex(long rowIndex);

	@Generated
	@Selector("removeRowsAtIndexes:includeSubrows:")
	public native void removeRowsAtIndexesIncludeSubrows(NSIndexSet rowIndexes,
			boolean includeSubrows);

	@Generated
	@Selector("rowClass")
	public native Class rowClass();

	@Generated
	@Selector("rowForDisplayValue:")
	public native long rowForDisplayValue(
			@Mapped(ObjCObjectMapper.class) Object displayValue);

	@Generated
	@Selector("rowHeight")
	public native double rowHeight();

	@Generated
	@Selector("rowTypeForRow:")
	public native long rowTypeForRow(long rowIndex);

	@Generated
	@Selector("rowTypeKeyPath")
	public native String rowTypeKeyPath();

	@Generated
	@Selector("selectRowIndexes:byExtendingSelection:")
	public native void selectRowIndexesByExtendingSelection(NSIndexSet indexes,
			boolean extend);

	@Generated
	@Selector("selectedRowIndexes")
	public native NSIndexSet selectedRowIndexes();

	@Generated
	@Selector("setCanRemoveAllRows:")
	public native void setCanRemoveAllRows(boolean val);

	@Generated
	@Selector("setCriteria:andDisplayValues:forRowAtIndex:")
	public native void setCriteriaAndDisplayValuesForRowAtIndex(
			NSArray criteria, NSArray values, long rowIndex);

	@Generated
	@Selector("setCriteriaKeyPath:")
	public native void setCriteriaKeyPath(String keyPath);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setDisplayValuesKeyPath:")
	public native void setDisplayValuesKeyPath(String keyPath);

	@Generated
	@Selector("setEditable:")
	public native void setEditable(boolean editable);

	@Generated
	@Selector("setFormattingDictionary:")
	public native void setFormattingDictionary(NSDictionary dictionary);

	@Generated
	@Selector("setFormattingStringsFilename:")
	public native void setFormattingStringsFilename(String stringsFilename);

	@Generated
	@Selector("setNestingMode:")
	public native void setNestingMode(long mode);

	@Generated
	@Selector("setRowClass:")
	public native void setRowClass(Class rowClass);

	@Generated
	@Selector("setRowHeight:")
	public native void setRowHeight(double height);

	@Generated
	@Selector("setRowTypeKeyPath:")
	public native void setRowTypeKeyPath(String keyPath);

	@Generated
	@Selector("setSubrowsKeyPath:")
	public native void setSubrowsKeyPath(String keyPath);

	@Generated
	@Selector("subrowIndexesForRow:")
	public native NSIndexSet subrowIndexesForRow(long rowIndex);

	@Generated
	@Selector("subrowsKeyPath")
	public native String subrowsKeyPath();
}
