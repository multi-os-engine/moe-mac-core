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

package mac.coretext.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class sfntNameHeader extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public sfntNameHeader() {
		super(sfntNameHeader.class);
	}

	@Generated
	protected sfntNameHeader(Pointer peer) {
		super(peer);
	}

	@Generated
	public sfntNameHeader(short format, short count, short stringOffset,
			@ByValue sfntNameRecord rec) {
		super(sfntNameHeader.class);
		setFormat(format);
		setCount(count);
		setStringOffset(stringOffset);
		setRec(rec);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short format();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFormat(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short count();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setCount(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short stringOffset();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setStringOffset(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ByValue
	public native sfntNameRecord rec();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setRec(@ByValue sfntNameRecord value);
}
