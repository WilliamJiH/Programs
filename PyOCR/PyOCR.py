import pytesseract
from PIL import Image

def get_bin_table(threshold=140):
    table = []
    for i in range(256):
        if i < threshold:
            table.append(0)
        else:
            table.append(1)
    return table

if __name__ == '__main__':
    image_path = 'test2.jpg'
    image = Image.open(image_path)
    imageL = image.convert('L')
    table = get_bin_table()
    out = imageL.point(table, '1')
    print(get_bin_table())