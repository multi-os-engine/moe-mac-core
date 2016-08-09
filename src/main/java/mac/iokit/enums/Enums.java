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

package mac.iokit.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class Enums {
	@Generated
	private Enums() {
	}

	@Generated
	public static final int kIOMapAnywhere = 0x00000001;
	@Generated
	public static final int kIOMapCacheMask = 0x00000700;
	@Generated
	public static final int kIOMapCacheShift = 0x00000008;
	@Generated
	public static final int kIOMapDefaultCache = 0x00000000;
	@Generated
	public static final int kIOMapInhibitCache = 0x00000100;
	@Generated
	public static final int kIOMapWriteThruCache = 0x00000200;
	@Generated
	public static final int kIOMapCopybackCache = 0x00000300;
	@Generated
	public static final int kIOMapWriteCombineCache = 0x00000400;
	@Generated
	public static final int kIOMapCopybackInnerCache = 0x00000500;
	@Generated
	public static final int kIOMapUserOptionsMask = 0x00000FFF;
	@Generated
	public static final int kIOMapReadOnly = 0x00001000;
	@Generated
	public static final int kIOMapStatic = 0x01000000;
	@Generated
	public static final int kIOMapReference = 0x02000000;
	@Generated
	public static final int kIOMapUnique = 0x04000000;
	@Generated
	public static final int kFramebufferSupportsCopybackCache = 0x00010000;
	@Generated
	public static final int kFramebufferSupportsWritethruCache = 0x00020000;
	@Generated
	public static final int kFramebufferSupportsGammaCorrection = 0x00040000;
	@Generated
	public static final int kFramebufferDisableAltivecAccess = 0x00080000;
	@Generated
	public static final int kIODefaultMemoryType = 0x00000000;
	@Generated
	public static final int kIOMirrorIsPrimary = 0x80000000;
	@Generated
	public static final int kIOMirrorHWClipped = 0x40000000;
	@Generated
	public static final int kIOMirrorIsMirrored = 0x20000000;
	@Generated
	public static final int kIOTimingIDInvalid = 0x00000000;
	@Generated
	public static final int kIOTimingIDApple_FixedRateLCD = 0x0000002A;
	@Generated
	public static final int kIOTimingIDApple_512x384_60hz = 0x00000082;
	@Generated
	public static final int kIOTimingIDApple_560x384_60hz = 0x00000087;
	@Generated
	public static final int kIOTimingIDApple_640x480_67hz = 0x0000008C;
	@Generated
	public static final int kIOTimingIDApple_640x400_67hz = 0x00000091;
	@Generated
	public static final int kIOTimingIDVESA_640x480_60hz = 0x00000096;
	@Generated
	public static final int kIOTimingIDVESA_640x480_72hz = 0x00000098;
	@Generated
	public static final int kIOTimingIDVESA_640x480_75hz = 0x0000009A;
	@Generated
	public static final int kIOTimingIDVESA_640x480_85hz = 0x0000009E;
	@Generated
	public static final int kIOTimingIDGTF_640x480_120hz = 0x0000009F;
	@Generated
	public static final int kIOTimingIDApple_640x870_75hz = 0x000000A0;
	@Generated
	public static final int kIOTimingIDApple_640x818_75hz = 0x000000A5;
	@Generated
	public static final int kIOTimingIDApple_832x624_75hz = 0x000000AA;
	@Generated
	public static final int kIOTimingIDVESA_800x600_56hz = 0x000000B4;
	@Generated
	public static final int kIOTimingIDVESA_800x600_60hz = 0x000000B6;
	@Generated
	public static final int kIOTimingIDVESA_800x600_72hz = 0x000000B8;
	@Generated
	public static final int kIOTimingIDVESA_800x600_75hz = 0x000000BA;
	@Generated
	public static final int kIOTimingIDVESA_800x600_85hz = 0x000000BC;
	@Generated
	public static final int kIOTimingIDVESA_1024x768_60hz = 0x000000BE;
	@Generated
	public static final int kIOTimingIDVESA_1024x768_70hz = 0x000000C8;
	@Generated
	public static final int kIOTimingIDVESA_1024x768_75hz = 0x000000CC;
	@Generated
	public static final int kIOTimingIDVESA_1024x768_85hz = 0x000000D0;
	@Generated
	public static final int kIOTimingIDApple_1024x768_75hz = 0x000000D2;
	@Generated
	public static final int kIOTimingIDVESA_1152x864_75hz = 0x000000D7;
	@Generated
	public static final int kIOTimingIDApple_1152x870_75hz = 0x000000DC;
	@Generated
	public static final int kIOTimingIDAppleNTSC_ST = 0x000000E6;
	@Generated
	public static final int kIOTimingIDAppleNTSC_FF = 0x000000E8;
	@Generated
	public static final int kIOTimingIDAppleNTSC_STconv = 0x000000EA;
	@Generated
	public static final int kIOTimingIDAppleNTSC_FFconv = 0x000000EC;
	@Generated
	public static final int kIOTimingIDApplePAL_ST = 0x000000EE;
	@Generated
	public static final int kIOTimingIDApplePAL_FF = 0x000000F0;
	@Generated
	public static final int kIOTimingIDApplePAL_STconv = 0x000000F2;
	@Generated
	public static final int kIOTimingIDApplePAL_FFconv = 0x000000F4;
	@Generated
	public static final int kIOTimingIDVESA_1280x960_75hz = 0x000000FA;
	@Generated
	public static final int kIOTimingIDVESA_1280x960_60hz = 0x000000FC;
	@Generated
	public static final int kIOTimingIDVESA_1280x960_85hz = 0x000000FE;
	@Generated
	public static final int kIOTimingIDVESA_1280x1024_60hz = 0x00000104;
	@Generated
	public static final int kIOTimingIDVESA_1280x1024_75hz = 0x00000106;
	@Generated
	public static final int kIOTimingIDVESA_1280x1024_85hz = 0x0000010C;
	@Generated
	public static final int kIOTimingIDVESA_1600x1200_60hz = 0x00000118;
	@Generated
	public static final int kIOTimingIDVESA_1600x1200_65hz = 0x0000011A;
	@Generated
	public static final int kIOTimingIDVESA_1600x1200_70hz = 0x0000011C;
	@Generated
	public static final int kIOTimingIDVESA_1600x1200_75hz = 0x0000011E;
	@Generated
	public static final int kIOTimingIDVESA_1600x1200_80hz = 0x00000120;
	@Generated
	public static final int kIOTimingIDVESA_1600x1200_85hz = 0x00000121;
	@Generated
	public static final int kIOTimingIDVESA_1792x1344_60hz = 0x00000128;
	@Generated
	public static final int kIOTimingIDVESA_1792x1344_75hz = 0x0000012A;
	@Generated
	public static final int kIOTimingIDVESA_1856x1392_60hz = 0x0000012C;
	@Generated
	public static final int kIOTimingIDVESA_1856x1392_75hz = 0x0000012E;
	@Generated
	public static final int kIOTimingIDVESA_1920x1440_60hz = 0x00000130;
	@Generated
	public static final int kIOTimingIDVESA_1920x1440_75hz = 0x00000132;
	@Generated
	public static final int kIOTimingIDSMPTE240M_60hz = 0x00000190;
	@Generated
	public static final int kIOTimingIDFilmRate_48hz = 0x0000019A;
	@Generated
	public static final int kIOTimingIDSony_1600x1024_76hz = 0x000001F4;
	@Generated
	public static final int kIOTimingIDSony_1920x1080_60hz = 0x000001FE;
	@Generated
	public static final int kIOTimingIDSony_1920x1080_72hz = 0x00000208;
	@Generated
	public static final int kIOTimingIDSony_1920x1200_76hz = 0x0000021C;
	@Generated
	public static final int kIOTimingIDApple_0x0_0hz_Offline = 0x00000226;
	@Generated
	public static final int kIOTimingIDVESA_848x480_60hz = 0x0000023A;
	@Generated
	public static final int kIOTimingIDVESA_1360x768_60hz = 0x0000024E;
	@Generated
	public static final int kDisplayModeValidFlag = 0x00000001;
	@Generated
	public static final int kDisplayModeSafeFlag = 0x00000002;
	@Generated
	public static final int kDisplayModeDefaultFlag = 0x00000004;
	@Generated
	public static final int kIODisplayModeIDBootProgrammable = 0xFFFFFFFB;
	@Generated
	public static final int kIODisplayModeIDReservedBase = 0x80000000;
	@Generated
	public static final int kIORangeSupportsInterlacedCEATiming = 0x00000004;
	@Generated
	public static final int kIORangeSupportsInterlacedCEATimingWithConfirm = 0x00000008;
	@Generated
	public static final int kOSAsyncRefCount = 0x00000008;
	@Generated
	public static final int kOSAsyncRefSize = 0x00000020;
	@Generated
	public static final int kIOAsyncReservedIndex = 0x00000000;
	@Generated
	public static final int kIOAsyncReservedCount = 0x00000001;
	@Generated
	public static final int kIOAsyncCalloutFuncIndex = 0x00000001;
	@Generated
	public static final int kIOAsyncCalloutRefconIndex = 0x00000002;
	@Generated
	public static final int kIOAsyncCalloutCount = 0x00000003;
	@Generated
	public static final int kIOMatchingCalloutFuncIndex = 0x00000001;
	@Generated
	public static final int kIOMatchingCalloutRefconIndex = 0x00000002;
	@Generated
	public static final int kIOMatchingCalloutCount = 0x00000003;
	@Generated
	public static final int kIOInterestCalloutFuncIndex = 0x00000001;
	@Generated
	public static final int kIOInterestCalloutRefconIndex = 0x00000002;
	@Generated
	public static final int kIOInterestCalloutServiceIndex = 0x00000003;
	@Generated
	public static final int kIOInterestCalloutCount = 0x00000004;
	@Generated
	public static final int kDisplayVendorIDUnknown = 0x756E6B6E;
	@Generated
	public static final int kDisplayProductIDGeneric = 0x00000717;
	@Generated
	public static final int kFirstIOKitNotificationType = 0x00000064;
	@Generated
	public static final int kIOServicePublishNotificationType = 0x00000064;
	@Generated
	public static final int kIOServiceMatchedNotificationType = 0x00000065;
	@Generated
	public static final int kIOServiceTerminatedNotificationType = 0x00000066;
	@Generated
	public static final int kIOAsyncCompletionNotificationType = 0x00000096;
	@Generated
	public static final int kIOServiceMessageNotificationType = 0x000000A0;
	@Generated
	public static final int kLastIOKitNotificationType = 0x000000C7;
	@Generated
	public static final int kIOFBSystemAperture = 0x00000000;
	@Generated
	public static final int kIOFBBitRateRBR = 0x00000006;
	@Generated
	public static final int kIOFBBitRateHBR = 0x0000000A;
	@Generated
	public static final int kIOFBBitRateHBR2 = 0x00000014;
	@Generated
	public static final int kIOFBLinkVoltageLevel0 = 0x00000000;
	@Generated
	public static final int kIOFBLinkVoltageLevel1 = 0x00000001;
	@Generated
	public static final int kIOFBLinkVoltageLevel2 = 0x00000002;
	@Generated
	public static final int kIOFBLinkVoltageLevel3 = 0x00000003;
	@Generated
	public static final int kIODigitalSignal = 0x00000001;
	@Generated
	public static final int kIOAnalogSetupExpected = 0x00000002;
	@Generated
	public static final int kIOInterlacedCEATiming = 0x00000004;
	@Generated
	public static final int kIONTSCTiming = 0x00000008;
	@Generated
	public static final int kIOPALTiming = 0x00000010;
	@Generated
	public static final int kIOFBAVSignalTypeUnknown = 0x00000000;
	@Generated
	public static final int kIOFBAVSignalTypeVGA = 0x00000001;
	@Generated
	public static final int kIOFBAVSignalTypeDVI = 0x00000002;
	@Generated
	public static final int kIOFBAVSignalTypeHDMI = 0x00000008;
	@Generated
	public static final int kIOFBAVSignalTypeDP = 0x00000010;
	@Generated
	public static final int kNanosecondScale = 0x00000001;
	@Generated
	public static final int kMicrosecondScale = 0x000003E8;
	@Generated
	public static final int kMillisecondScale = 0x000F4240;
	@Generated
	public static final int kSecondScale = 0x3B9ACA00;
	@Generated
	public static final int kTickScale = 0x00989680;
	@Generated
	public static final int kIODisplayNeedsCEAUnderscan = 0x00000001;
	@Generated
	public static final int kIOFBVBLInterruptType = 0x76626C20;
	@Generated
	public static final int kIOFBHBLInterruptType = 0x68626C20;
	@Generated
	public static final int kIOFBFrameInterruptType = 0x6672616D;
	@Generated
	public static final int kIOFBConnectInterruptType = 0x64636920;
	@Generated
	public static final int kIOFBChangedInterruptType = 0x63686E67;
	@Generated
	public static final int kIOFBOfflineInterruptType = 0x72656D76;
	@Generated
	public static final int kIOFBOnlineInterruptType = 0x61646420;
	@Generated
	public static final int kIOFBDisplayPortInterruptType = 0x64706972;
	@Generated
	public static final int kIOFBDisplayPortLinkChangeInterruptType = 0x64706C6B;
	@Generated
	public static final int kIOFBMCCSInterruptType = 0x6D636373;
	@Generated
	public static final int kIOFBWakeInterruptType = 0x7677616B;
	@Generated
	public static final int kIODefaultCache = 0x00000000;
	@Generated
	public static final int kIOInhibitCache = 0x00000001;
	@Generated
	public static final int kIOWriteThruCache = 0x00000002;
	@Generated
	public static final int kIOCopybackCache = 0x00000003;
	@Generated
	public static final int kIOWriteCombineCache = 0x00000004;
	@Generated
	public static final int kIOCopybackInnerCache = 0x00000005;
	@Generated
	public static final int kIOMirrorDefault = 0x00000001;
	@Generated
	public static final int kIOMirrorForced = 0x00000002;
	@Generated
	public static final int kHardwareCursorInfoMajorVersion = 0x00000001;
	@Generated
	public static final int kHardwareCursorInfoMinorVersion = 0x00000000;
	@Generated
	public static final int kIOFBLinkScramblerNormal = 0x00000000;
	@Generated
	public static final int kIOFBLinkScramblerAlternate = 0x00000001;
	@Generated
	public static final int kIODisplayPowerStateOff = 0x00000000;
	@Generated
	public static final int kIODisplayPowerStateMinUsable = 0x00000001;
	@Generated
	public static final int kIODisplayPowerStateOn = 0x00000002;
	@Generated
	public static final int kDisplaySubPixelLayoutUndefined = 0x00000000;
	@Generated
	public static final int kDisplaySubPixelLayoutRGB = 0x00000001;
	@Generated
	public static final int kDisplaySubPixelLayoutBGR = 0x00000002;
	@Generated
	public static final int kDisplaySubPixelLayoutQuadGBL = 0x00000003;
	@Generated
	public static final int kDisplaySubPixelLayoutQuadGBR = 0x00000004;
	@Generated
	public static final int kDisplaySubPixelConfigurationUndefined = 0x00000000;
	@Generated
	public static final int kDisplaySubPixelConfigurationDelta = 0x00000001;
	@Generated
	public static final int kDisplaySubPixelConfigurationStripe = 0x00000002;
	@Generated
	public static final int kDisplaySubPixelConfigurationStripeOffset = 0x00000003;
	@Generated
	public static final int kDisplaySubPixelConfigurationQuad = 0x00000004;
	@Generated
	public static final int kDisplaySubPixelShapeUndefined = 0x00000000;
	@Generated
	public static final int kDisplaySubPixelShapeRound = 0x00000001;
	@Generated
	public static final int kDisplaySubPixelShapeSquare = 0x00000002;
	@Generated
	public static final int kDisplaySubPixelShapeRectangular = 0x00000003;
	@Generated
	public static final int kDisplaySubPixelShapeOval = 0x00000004;
	@Generated
	public static final int kDisplaySubPixelShapeElliptical = 0x00000005;
	@Generated
	public static final int kConnectionFlags = 0x666C6773;
	@Generated
	public static final int kConnectionSyncEnable = 0x73796E63;
	@Generated
	public static final int kConnectionSyncFlags = 0x73796366;
	@Generated
	public static final int kConnectionSupportsAppleSense = 0x61736E73;
	@Generated
	public static final int kConnectionSupportsLLDDCSense = 0x6C646463;
	@Generated
	public static final int kConnectionSupportsHLDDCSense = 0x68646463;
	@Generated
	public static final int kConnectionEnable = 0x656E6162;
	@Generated
	public static final int kConnectionCheckEnable = 0x63656E61;
	@Generated
	public static final int kConnectionProbe = 0x70726F62;
	@Generated
	public static final int kConnectionChanged = 0x63686E67;
	@Generated
	public static final int kConnectionPower = 0x706F7772;
	@Generated
	public static final int kConnectionPostWake = 0x7077616B;
	@Generated
	public static final int kConnectionDisplayParameterCount = 0x70636E74;
	@Generated
	public static final int kConnectionDisplayParameters = 0x7061726D;
	@Generated
	public static final int kConnectionOverscan = 0x6F73636E;
	@Generated
	public static final int kConnectionVideoBest = 0x76627374;
	@Generated
	public static final int kConnectionRedGammaScale = 0x72677363;
	@Generated
	public static final int kConnectionGreenGammaScale = 0x67677363;
	@Generated
	public static final int kConnectionBlueGammaScale = 0x62677363;
	@Generated
	public static final int kConnectionGammaScale = 0x67736320;
	@Generated
	public static final int kConnectionFlushParameters = 0x666C7573;
	@Generated
	public static final int kConnectionHandleDisplayPortEvent = 0x64706972;
	@Generated
	public static final int kConnectionPanelTimingDisable = 0x706E6C74;
	@Generated
	public static final int kConnectionColorMode = 0x63797576;
	@Generated
	public static final int kConnectionColorModesSupported = 0x636F6C72;
	@Generated
	public static final int kConnectionColorDepthsSupported = 0x20627063;
	@Generated
	public static final int kConnectionControllerDepthsSupported = 0x00677264;
	@Generated
	public static final int kConnectionControllerColorDepth = 0x00647064;
	@Generated
	public static final int kConnectionControllerDitherControl = 0x00676463;
	@Generated
	public static final int kConnectionDisplayFlags = 0x64666C67;
	@Generated
	public static final int kConnectionEnableAudio = 0x61756420;
	@Generated
	public static final int kConnectionAudioStreaming = 0x61756473;
	@Generated
	public static final int kIODPEventStart = 0x00000001;
	@Generated
	public static final int kIODPEventIdle = 0x00000002;
	@Generated
	public static final int kIODPEventForceRetrain = 0x00000003;
	@Generated
	public static final int kIODPEventRemoteControlCommandPending = 0x00000100;
	@Generated
	public static final int kIODPEventAutomatedTestRequest = 0x00000101;
	@Generated
	public static final int kIODPEventContentProtection = 0x00000102;
	@Generated
	public static final int kIODPEventMCCS = 0x00000103;
	@Generated
	public static final int kIODPEventSinkSpecific = 0x00000104;
	@Generated
	public static final int kIODisplayDitherDisable = 0x00000000;
	@Generated
	public static final int kIODisplayDitherSpatial = 0x00000001;
	@Generated
	public static final int kIODisplayDitherTemporal = 0x00000002;
	@Generated
	public static final int kIODisplayDitherFrameRateControl = 0x00000004;
	@Generated
	public static final int kIODisplayDitherDefault = 0x00000080;
	@Generated
	public static final int kIODisplayDitherAll = 0x000000FF;
	@Generated
	public static final int kIODisplayDitherRGBShift = 0x00000000;
	@Generated
	public static final int kIODisplayDitherYCbCr444Shift = 0x00000008;
	@Generated
	public static final int kIODisplayDitherYCbCr422Shift = 0x00000010;
	@Generated
	public static final int kIOSyncPositivePolarity = 0x00000001;
	@Generated
	public static final int kOSNotificationMessageID = 0x00000035;
	@Generated
	public static final int kOSAsyncCompleteMessageID = 0x00000039;
	@Generated
	public static final int kMaxAsyncArgs = 0x00000010;
	@Generated
	public static final int kIOMaxPixelBits = 0x00000040;
	@Generated
	public static final int kIOScaleStretchToFit = 0x00000001;
	@Generated
	public static final int kIOScaleRotateFlags = 0x000000F0;
	@Generated
	public static final int kIOScaleSwapAxes = 0x00000010;
	@Generated
	public static final int kIOScaleInvertX = 0x00000020;
	@Generated
	public static final int kIOScaleInvertY = 0x00000040;
	@Generated
	public static final int kIOScaleRotate0 = 0x00000000;
	@Generated
	public static final int kIOScaleRotate90 = 0x00000030;
	@Generated
	public static final int kIOScaleRotate180 = 0x00000060;
	@Generated
	public static final int kIOScaleRotate270 = 0x00000050;
	@Generated
	public static final int kIOHSyncDisable = 0x00000001;
	@Generated
	public static final int kIOVSyncDisable = 0x00000002;
	@Generated
	public static final int kIOCSyncDisable = 0x00000004;
	@Generated
	public static final int kIONoSeparateSyncControl = 0x00000040;
	@Generated
	public static final int kIOTriStateSyncs = 0x00000080;
	@Generated
	public static final int kIOSyncOnBlue = 0x00000008;
	@Generated
	public static final int kIOSyncOnGreen = 0x00000010;
	@Generated
	public static final int kIOSyncOnRed = 0x00000020;
	@Generated
	public static final int kIOConnectionBuiltIn = 0x00000800;
	@Generated
	public static final int kIOConnectionStereoSync = 0x00008000;
	@Generated
	public static final int kOSAsyncRef64Count = 0x00000008;
	@Generated
	public static final int kOSAsyncRef64Size = 0x00000040;
	@Generated
	public static final int kSetCLUTByValue = 0x00000001;
	@Generated
	public static final int kSetCLUTImmediately = 0x00000002;
	@Generated
	public static final int kSetCLUTWithLuminance = 0x00000004;
	@Generated
	public static final int kIOFBLinkDownspreadNone = 0x00000000;
	@Generated
	public static final int kIOFBLinkDownspreadMax = 0x00000001;
	@Generated
	public static final int kIORangeSupportsSignal_0700_0300 = 0x00000001;
	@Generated
	public static final int kIORangeSupportsSignal_0714_0286 = 0x00000002;
	@Generated
	public static final int kIORangeSupportsSignal_1000_0400 = 0x00000004;
	@Generated
	public static final int kIORangeSupportsSignal_0700_0000 = 0x00000008;
	@Generated
	public static final int kIOConnectMethodVarOutputSize = 0xFFFFFFFD;
	@Generated
	public static final int kIOCLUTPixels = 0x00000000;
	@Generated
	public static final int kIOFixedCLUTPixels = 0x00000001;
	@Generated
	public static final int kIORGBDirectPixels = 0x00000002;
	@Generated
	public static final int kIOMonoDirectPixels = 0x00000003;
	@Generated
	public static final int kIOMonoInverseDirectPixels = 0x00000004;
	@Generated
	public static final int kIORGBSignedDirectPixels = 0x00000005;
	@Generated
	public static final int kIORGBSignedFloatingPointPixels = 0x00000006;
	@Generated
	public static final int kDisplayModeSafetyFlags = 0x00000007;
	@Generated
	public static final int kDisplayModeAlwaysShowFlag = 0x00000008;
	@Generated
	public static final int kDisplayModeNeverShowFlag = 0x00000080;
	@Generated
	public static final int kDisplayModeNotResizeFlag = 0x00000010;
	@Generated
	public static final int kDisplayModeRequiresPanFlag = 0x00000020;
	@Generated
	public static final int kDisplayModeInterlacedFlag = 0x00000040;
	@Generated
	public static final int kDisplayModeSimulscanFlag = 0x00000100;
	@Generated
	public static final int kDisplayModeBuiltInFlag = 0x00000400;
	@Generated
	public static final int kDisplayModeNotPresetFlag = 0x00000200;
	@Generated
	public static final int kDisplayModeStretchedFlag = 0x00000800;
	@Generated
	public static final int kDisplayModeNotGraphicsQualityFlag = 0x00001000;
	@Generated
	public static final int kDisplayModeValidateAgainstDisplay = 0x00002000;
	@Generated
	public static final int kDisplayModeTelevisionFlag = 0x00100000;
	@Generated
	public static final int kDisplayModeValidForMirroringFlag = 0x00200000;
	@Generated
	public static final int kDisplayModeAcceleratorBackedFlag = 0x00400000;
	@Generated
	public static final int kDisplayModeValidForHiResFlag = 0x00800000;
	@Generated
	public static final int kDisplayModeValidForAirPlayFlag = 0x01000000;
	@Generated
	public static final int kDisplayModeNativeFlag = 0x02000000;
	@Generated
	public static final int kIOAnalogSignalLevel_0700_0300 = 0x00000000;
	@Generated
	public static final int kIOAnalogSignalLevel_0714_0286 = 0x00000001;
	@Generated
	public static final int kIOAnalogSignalLevel_1000_0400 = 0x00000002;
	@Generated
	public static final int kIOAnalogSignalLevel_0700_0000 = 0x00000003;
	@Generated
	public static final int kIODisplayRGBColorComponentBitsUnknown = 0x00000000;
	@Generated
	public static final int kIODisplayRGBColorComponentBits6 = 0x00000001;
	@Generated
	public static final int kIODisplayRGBColorComponentBits8 = 0x00000002;
	@Generated
	public static final int kIODisplayRGBColorComponentBits10 = 0x00000004;
	@Generated
	public static final int kIODisplayRGBColorComponentBits12 = 0x00000008;
	@Generated
	public static final int kIODisplayRGBColorComponentBits14 = 0x00000010;
	@Generated
	public static final int kIODisplayRGBColorComponentBits16 = 0x00000020;
	@Generated
	public static final int kIODisplayYCbCr444ColorComponentBitsUnknown = 0x00000000;
	@Generated
	public static final int kIODisplayYCbCr444ColorComponentBits6 = 0x00000100;
	@Generated
	public static final int kIODisplayYCbCr444ColorComponentBits8 = 0x00000200;
	@Generated
	public static final int kIODisplayYCbCr444ColorComponentBits10 = 0x00000400;
	@Generated
	public static final int kIODisplayYCbCr444ColorComponentBits12 = 0x00000800;
	@Generated
	public static final int kIODisplayYCbCr444ColorComponentBits14 = 0x00001000;
	@Generated
	public static final int kIODisplayYCbCr444ColorComponentBits16 = 0x00002000;
	@Generated
	public static final int kIODisplayYCbCr422ColorComponentBitsUnknown = 0x00000000;
	@Generated
	public static final int kIODisplayYCbCr422ColorComponentBits6 = 0x00010000;
	@Generated
	public static final int kIODisplayYCbCr422ColorComponentBits8 = 0x00020000;
	@Generated
	public static final int kIODisplayYCbCr422ColorComponentBits10 = 0x00040000;
	@Generated
	public static final int kIODisplayYCbCr422ColorComponentBits12 = 0x00080000;
	@Generated
	public static final int kIODisplayYCbCr422ColorComponentBits14 = 0x00100000;
	@Generated
	public static final int kIODisplayYCbCr422ColorComponentBits16 = 0x00200000;
	@Generated
	public static final int kIOFBUserRequestProbe = 0x00000001;
	@Generated
	public static final int kIOHibernatePreviewActive = 0x00000001;
	@Generated
	public static final int kIOHibernatePreviewUpdates = 0x00000002;
	@Generated
	public static final int kIOPowerStateAttribute = 0x70777273;
	@Generated
	public static final int kIOPowerAttribute = 0x706F7772;
	@Generated
	public static final int kIODriverPowerAttribute = 0x64706F77;
	@Generated
	public static final int kIOHardwareCursorAttribute = 0x63727372;
	@Generated
	public static final int kIOMirrorAttribute = 0x6D697272;
	@Generated
	public static final int kIOMirrorDefaultAttribute = 0x6D726466;
	@Generated
	public static final int kIOCapturedAttribute = 0x63617064;
	@Generated
	public static final int kIOCursorControlAttribute = 0x63727363;
	@Generated
	public static final int kIOSystemPowerAttribute = 0x73707772;
	@Generated
	public static final int kIOVRAMSaveAttribute = 0x76727376;
	@Generated
	public static final int kIODeferCLUTSetAttribute = 0x76636C74;
	@Generated
	public static final int kIOClamshellStateAttribute = 0x636C616D;
	@Generated
	public static final int kIOFBDisplayPortTrainingAttribute = 0x64707461;
	@Generated
	public static final int kOrConnections = 0x0FFFFFFE;
	@Generated
	public static final int kAndConnections = 0x0FFFFFFD;
	@Generated
	public static final int kHardwareCursorDescriptorMajorVersion = 0x00000001;
	@Generated
	public static final int kHardwareCursorDescriptorMinorVersion = 0x00000000;
	@Generated
	public static final int kIODetailedTimingValid = 0x80000000;
	@Generated
	public static final int kIOScalingInfoValid = 0x40000000;
	@Generated
	public static final int kTransparentEncoding = 0x00000000;
	@Generated
	public static final int kInvertingEncoding = 0x00000001;
	@Generated
	public static final int kIOScaleStretchOnly = 0x00000001;
	@Generated
	public static final int kIOScaleCanUpSamplePixels = 0x00000002;
	@Generated
	public static final int kIOScaleCanDownSamplePixels = 0x00000004;
	@Generated
	public static final int kIOScaleCanScaleInterlaced = 0x00000008;
	@Generated
	public static final int kIOScaleCanSupportInset = 0x00000010;
	@Generated
	public static final int kIOScaleCanRotate = 0x00000020;
	@Generated
	public static final int kIOScaleCanBorderInsetOnly = 0x00000040;
	@Generated
	public static final int kIOFBServerConnectType = 0x00000000;
	@Generated
	public static final int kIOFBSharedConnectType = 0x00000001;
	@Generated
	public static final int kIODisplayColorMode = 0x63797576;
	@Generated
	public static final int kIORegistryIterateRecursively = 0x00000001;
	@Generated
	public static final int kIORegistryIterateParents = 0x00000002;
	@Generated
	public static final int kTransparentEncodingShift = 0x00000000;
	@Generated
	public static final int kTransparentEncodedPixel = 0x00000001;
	@Generated
	public static final int kInvertingEncodingShift = 0x00000002;
	@Generated
	public static final int kInvertingEncodedPixel = 0x00000004;
	@Generated
	public static final int kIOFBLinkPreEmphasisLevel0 = 0x00000000;
	@Generated
	public static final int kIOFBLinkPreEmphasisLevel1 = 0x00000001;
	@Generated
	public static final int kIOFBLinkPreEmphasisLevel2 = 0x00000002;
	@Generated
	public static final int kIOFBLinkPreEmphasisLevel3 = 0x00000003;
	@Generated
	public static final int kIORangeSupportsSeparateSyncs = 0x00000001;
	@Generated
	public static final int kIORangeSupportsSyncOnGreen = 0x00000002;
	@Generated
	public static final int kIORangeSupportsCompositeSync = 0x00000004;
	@Generated
	public static final int kIORangeSupportsVSyncSerration = 0x00000008;
}
