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

package mac.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class vm_statistics64 extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public vm_statistics64() {
		super(vm_statistics64.class);
	}

	@Generated
	protected vm_statistics64(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int free_count();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFree_count(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int active_count();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setActive_count(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int inactive_count();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setInactive_count(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int wire_count();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setWire_count(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native long zero_fill_count();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setZero_fill_count(long value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native long reactivations();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setReactivations(long value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native long pageins();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setPageins(long value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native long pageouts();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setPageouts(long value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native long faults();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setFaults(long value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native long cow_faults();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setCow_faults(long value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native long lookups();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setLookups(long value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native long hits();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setHits(long value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native long purges();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setPurges(long value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native int purgeable_count();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setPurgeable_count(int value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native int speculative_count();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setSpeculative_count(int value);

	@Generated
	@StructureField(order = 15, isGetter = true)
	public native long decompressions();

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setDecompressions(long value);

	@Generated
	@StructureField(order = 16, isGetter = true)
	public native long compressions();

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void setCompressions(long value);

	@Generated
	@StructureField(order = 17, isGetter = true)
	public native long swapins();

	@Generated
	@StructureField(order = 17, isGetter = false)
	public native void setSwapins(long value);

	@Generated
	@StructureField(order = 18, isGetter = true)
	public native long swapouts();

	@Generated
	@StructureField(order = 18, isGetter = false)
	public native void setSwapouts(long value);

	@Generated
	@StructureField(order = 19, isGetter = true)
	public native int compressor_page_count();

	@Generated
	@StructureField(order = 19, isGetter = false)
	public native void setCompressor_page_count(int value);

	@Generated
	@StructureField(order = 20, isGetter = true)
	public native int throttled_count();

	@Generated
	@StructureField(order = 20, isGetter = false)
	public native void setThrottled_count(int value);

	@Generated
	@StructureField(order = 21, isGetter = true)
	public native int external_page_count();

	@Generated
	@StructureField(order = 21, isGetter = false)
	public native void setExternal_page_count(int value);

	@Generated
	@StructureField(order = 22, isGetter = true)
	public native int internal_page_count();

	@Generated
	@StructureField(order = 22, isGetter = false)
	public native void setInternal_page_count(int value);

	@Generated
	@StructureField(order = 23, isGetter = true)
	public native long total_uncompressed_pages_in_compressor();

	@Generated
	@StructureField(order = 23, isGetter = false)
	public native void setTotal_uncompressed_pages_in_compressor(long value);
}
