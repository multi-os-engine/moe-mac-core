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
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class TrakTable extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public TrakTable() {
		super(TrakTable.class);
	}

	@Generated
	protected TrakTable(Pointer peer) {
		super(peer);
	}

	@Generated
	public TrakTable(int version, short format, short horizOffset,
			short vertOffset) {
		super(TrakTable.class);
		setVersion(version);
		setFormat(format);
		setHorizOffset(horizOffset);
		setVertOffset(vertOffset);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short format();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setFormat(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short horizOffset();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setHorizOffset(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short vertOffset();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setVertOffset(short value);
}
