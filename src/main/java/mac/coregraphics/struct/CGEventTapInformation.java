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

package mac.coregraphics.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CGEventTapInformation extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CGEventTapInformation() {
		super(CGEventTapInformation.class);
	}

	@Generated
	protected CGEventTapInformation(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int eventTapID();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setEventTapID(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int tapPoint();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setTapPoint(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int options();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setOptions(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long eventsOfInterest();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setEventsOfInterest(long value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int tappingProcess();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setTappingProcess(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int processBeingTapped();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setProcessBeingTapped(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native boolean enabled();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setEnabled(boolean value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native float minUsecLatency();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setMinUsecLatency(float value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native float avgUsecLatency();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setAvgUsecLatency(float value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native float maxUsecLatency();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setMaxUsecLatency(float value);
}
