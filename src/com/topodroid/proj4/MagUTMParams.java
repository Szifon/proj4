/* @file MagUTMParams.java
 *
 * @author marco corvi
 * @date jan 2017
 *
 * @brief Proij4 World Magnetic Model (copied from TopoDroid)
 * --------------------------------------------------------
 *  Copyright This sowftare is distributed under GPL-3.0 or later
 *  See the file COPYING.
 * --------------------------------------------------------
 * Implemented after GeomagneticLibrary.c by
 *  National Geophysical Data Center
 *  NOAA EGC/2
 *  325 Broadway
 *  Boulder, CO 80303 USA
 *  Attn: Susan McLean
 *  Phone:  (303) 497-6478
 *  Email:  Susan.McLean@noaa.gov
 */
package com.topodroid.proj4;

// MAGtype_UTMParameters;
public class MagUTMParams {
  double Lambda;   // used in calculation
  double Easting;  // (X) in meters
  double Northing; // (Y) in meters
  int    Zone;     // UTM Zone
  char   HemiSphere;
  double CentralMeridian;
  double ConvergenceOfMeridians;
  double PointScale;
}
