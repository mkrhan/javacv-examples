/*
 * Copyright (c) 2011 Jarek Sacha. All Rights Reserved.
 *
 * Author's e-mail: jarek.listy at gmail.com
 */

package opencv2_cookbook.chapter08

import opencv2_cookbook.OpenCVUtils._
import java.io.File
import com.googlecode.javacv.cpp.opencv_core._
import com.googlecode.javacv.cpp.opencv_features2d._


/**
 * Example of extracting SURF features from section "Detecting the scale-invariant SURF features" in chapter 8.
 */
object SURF extends App {

    // Read input image
    val image = loadAndShow(new File("../data/church01.jpg"))

    val keyPoints = new KeyPoint()
    val surf = new SurfFeatureDetector()
    val descriptors = new CvMat()
    surf.detect(image, keyPoints, descriptors)

    System.out.println("keyPoints: " + keyPoints.capacity)

    // drawKeypoints(...)
}