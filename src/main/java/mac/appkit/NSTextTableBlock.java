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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextTableBlock extends NSTextBlock {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTextTableBlock(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTextTableBlock alloc();

	@Generated
	@Selector("columnSpan")
	public native long columnSpan();

	@Generated
	@Selector("init")
	public native NSTextTableBlock init();

	@Generated
	@Selector("initWithTable:startingRow:rowSpan:startingColumn:columnSpan:")
	public native NSTextTableBlock initWithTableStartingRowRowSpanStartingColumnColumnSpan(
			NSTextTable table, long row, long rowSpan, long col, long colSpan);

	@Generated
	@Selector("rowSpan")
	public native long rowSpan();

	@Generated
	@Selector("startingColumn")
	public native long startingColumn();

	@Generated
	@Selector("startingRow")
	public native long startingRow();

	@Generated
	@Selector("table")
	public native NSTextTable table();
}
