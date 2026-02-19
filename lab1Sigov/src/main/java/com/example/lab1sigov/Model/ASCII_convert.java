package com.example.lab1sigov.Model;

public class ASCII_convert {
    private String text;

    public ASCII_convert(String t) {
        text = t;
    }

    public String stringToASCII() {
        try {
            String result = "";
            for (int i = 0; i < text.length(); i++) {
                if (i > 0) result = result + " ";
                result = result + (int) text.charAt(i);
            }
            return result;
        } catch (Throwable _) {
            return "";
        }
    }

    public String ASCIITostring() {
        try {
            String result = "";
            String[] codeArray = text.split(" ");
            for (String code : codeArray) {
                int asciiCode = Integer.parseInt(code.trim());
                result = result + (char) asciiCode;
            }
            return result;
        } catch (Throwable _) {
            return "";
        }
    }

    public String ASCIIToBinary() {
        try {
            String result = "";
            for (int i = 0; i < text.length(); i++) {
                if (i > 0) result = result + " ";
                result = result + Integer.toBinaryString(text.charAt(i));
            }
            return result;
        } catch (Throwable _) {
            return "";
        }
    }

    public String BinaryToASCII() {
        try {
            String result = "";
            String[] binaryArray = text.split(" ");
            for (String binary : binaryArray) {
                int asciiCode = Integer.parseInt(binary.trim(), 2);
                result = result + (char) asciiCode;
            }
            return result;
        } catch (Throwable _) {
            return "";
        }
    }

    public String ASCIIToHex() {
        try {
            String result = "";
            for (int i = 0; i < text.length(); i++) {
                if (i > 0) result = result + " ";
                result = result + Integer.toHexString(text.charAt(i)).toUpperCase();
            }
            return result;
        } catch (Throwable _) {
            return "";
        }
    }

    public String HexToASCII() {
        try {
            String result = "";
            String[] hexArray = text.split(" ");
            for (String hex : hexArray) {
                int asciiCode = Integer.parseInt(hex.trim(), 16);
                result = result + (char) asciiCode;
            }
            return result;
        } catch (Throwable _) {
            return "";
        }
    }

    public String convert(String first, String second) {
        try {
            if (first.equals("String")) {
                if (second.equals("ASCII")) {
                    return stringToASCII();
                } else if (second.equals("Binary")) {
                    return ASCIIToBinary();
                } else if (second.equals("Hex")) {
                    return ASCIIToHex();
                }
            }

            if (first.equals("ASCII")) {
                if (second.equals("String")) {
                    return ASCIITostring();
                } else if (second.equals("Binary")) {
                    String tempText = ASCIITostring();
                    ASCII_convert temp = new ASCII_convert(tempText);
                    return temp.ASCIIToBinary();
                } else if (second.equals("Hex")) {
                    String tempText = ASCIITostring();
                    ASCII_convert temp = new ASCII_convert(tempText);
                    return temp.ASCIIToHex();
                }
            }
            if (first.equals("Binary")) {
                if (second.equals("String")) {
                    return BinaryToASCII();
                } else if (second.equals("ASCII")) {
                    String tempText = BinaryToASCII();
                    ASCII_convert temp = new ASCII_convert(tempText);
                    return temp.stringToASCII();
                } else if (second.equals("Hex")) {
                    String tempText = BinaryToASCII();
                    ASCII_convert temp = new ASCII_convert(tempText);
                    return temp.ASCIIToHex();
                }
            }

            if (first.equals("Hex")) {
                if (second.equals("String")) {
                    return HexToASCII();
                } else if (second.equals("ASCII")) {
                    String tempText = HexToASCII();
                    ASCII_convert temp = new ASCII_convert(tempText);
                    return temp.stringToASCII();
                } else if (second.equals("Binary")) {
                    String tempText = HexToASCII();
                    ASCII_convert temp = new ASCII_convert(tempText);
                    return temp.ASCIIToBinary();
                }
            }

            return "";
        } catch (Throwable _) {
            return "";
        }
    }
}