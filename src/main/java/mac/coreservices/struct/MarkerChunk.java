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

package mac.coreservices.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class MarkerChunk extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public MarkerChunk() {
		super(MarkerChunk.class);
	}

	@Generated
	protected MarkerChunk(Pointer peer) {
		super(peer);
	}

	@Generated
	public MarkerChunk(int ckID, int ckSize, short numMarkers,
			@ByValue Marker Markers) {
		super(MarkerChunk.class);
		setCkID(ckID);
		setCkSize(ckSize);
		setNumMarkers(numMarkers);
		setMarkers(Markers);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int ckID();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setCkID(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int ckSize();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setCkSize(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short numMarkers();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setNumMarkers(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ByValue
	public native Marker Markers();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setMarkers(@ByValue Marker value);
}
