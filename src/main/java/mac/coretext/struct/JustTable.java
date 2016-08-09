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
public final class JustTable extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public JustTable() {
		super(JustTable.class);
	}

	@Generated
	protected JustTable(Pointer peer) {
		super(peer);
	}

	@Generated
	public JustTable(int version, short format, short horizHeaderOffset,
			short vertHeaderOffset) {
		super(JustTable.class);
		setVersion(version);
		setFormat(format);
		setHorizHeaderOffset(horizHeaderOffset);
		setVertHeaderOffset(vertHeaderOffset);
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
	public native short horizHeaderOffset();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setHorizHeaderOffset(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short vertHeaderOffset();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setVertHeaderOffset(short value);
}
